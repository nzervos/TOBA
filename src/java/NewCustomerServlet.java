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
        
        String url = "/New_customer.html";
        String action = request.getParameter("action");
        
        if (action ==null){
            action = "join";
        }
        if (action.equals("join")){
            url = "/New_customer.html";
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
            
            
            User user = new User(firstName, lastName, phone, address, city, state, zip, email);
            
            request.setAttribute("user", user);
                      
            url = "/Success.html";
            
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
     }
    
        
    }

        

            
    