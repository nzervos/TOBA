/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NikoZ
 */
@WebServlet(urlPatterns = {"/User"})
public class User extends Serializable {
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    
    public User(){
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        email = "";
    }
    
    public User(String firstName, String lastName, 
                    String phone, String address, 
                    String city, String state, 
                    String zip, String email) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    
    public String getState(){
        return state;
    }
    
    public String getZip(){
        return zip;
    }
    
    public String getEmail(){
        return email;
    }
    
}
