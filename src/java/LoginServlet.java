/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NikoZ
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                            HttpServletResponse response)
            throws ServletException, IOException{
        
        String url = "/Login.html";
        String action = request.getParameter("action");
        
        if (action ==null){
            action = "join";
        }
        if (action.equals("join")){
            url = "/Login.html";
        }
        else if (action.equals("add")){
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String u = "jsmith@toba.com";
            String p = "letmein";
            if (username.equals(u)  && password.equals(p)){           
                url = "/Account_activity.html";            
        
            }
            else {
                url = "/Login_failure.html";
            }
        }
        
            getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }
}
