package toba.business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import toba.business.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import toba.data.UserDB;

/**
 *
 * @author NikoZ
 */
public class Reset extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
                            HttpServletResponse response)
            throws ServletException, IOException{
        
    String url = "/Reset.jsp";
    String action = request.getParameter("action");
        
        if (action ==null){
            action = "join";
        }
        if (action.equals("join")){
            url = "/Reset.jsp";
        }
        else if (action.equals("reset")){
            
            String password = request.getParameter("password");
            
           HttpSession session = request.getSession();
           User user = (User) session.getAttribute("user");
           user.setPassword(password);
           UserDB.updatePassword(user);
           url = "/account_activity.jsp";
            
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
