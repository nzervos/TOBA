/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        if (action.equals("reset")){
            
            
            url = "/account_activity.jsp";
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
            
            User user = new User(firstName, lastName, phone, address, city, state, zip, email, userName, password);
            
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
 }

        

            
    