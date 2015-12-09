package toba.business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import toba.business.User;
import toba.business.Account;
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.business.Account.accountType;
import toba.data.AccountDB;
import toba.data.UserDB;

/**
 *
 * @author NikoZ
 */
@WebServlet(urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                            HttpServletResponse response)
            throws ServletException, IOException{

        String url = "/New_customer.jsp";
    String action = request.getParameter("action");
        
        if (action ==null){
            action = "join";
        }
        if (action.equals("join")){
            url = "/New_customer.jsp";
        }
        else if (action.equals("add")){
            String firstName = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zip = request.getParameter("zip");
            String email = request.getParameter("email");
            String userName = lastName.concat(zip);
            String password = "welcome1";
            Double checkStartBalance = 0.00;
            Double saveStartBalance = 25.00;
            
            String message;
            try {
                PasswordUtil.checkPasswordStrength(password);
                message = "";
            } catch (Exception e) {
                message = e.getMessage();
            }
            request.setAttribute("message", message);
            
            String hashedPassword;
            String salt = "";
            String saltedAndHashedPassword;
            try {
                hashedPassword = PasswordUtil.hashedPassword(password);
                salt = PasswordUtil.getSalt();
                saltedAndHashedPassword = PasswordUtil.hashAndSaltPassword(password);
            } catch (NoSuchAlgorithmException ex) {
                hashedPassword = ex.getMessage();
                saltedAndHashedPassword = ex.getMessage();
            }
            
            request.setAttribute("hassedPassword", hashedPassword);
            request.setAttribute("salt", salt);
            request.setAttribute("saltedAndHashedPassword", saltedAndHashedPassword);
                        
            User user = new User(firstName, lastName, phone, address, city, state, zip, email, userName, password);
            Account userCheck = new Account(checkStartBalance, userName, accountType.Checking);
            Account userSave = new Account(saveStartBalance, userName, accountType.Savings);
            AccountDB.insert(userCheck);
            AccountDB.insert(userSave);
            UserDB.insert(user);
            
            request.setAttribute("user", user);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
                            
            url = "/Success.jsp";
            
        }
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
 }

        

            
    