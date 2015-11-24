/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;


public class User implements Serializable {
    
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String username;
    private String password;
    
    public User(){
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        email = "";
        username = "";
        password = "";
    }
    
    public User(String firstName, String lastName, 
                    String phone, String address, 
                    String city, String state, 
                    String zip, String email,
                    String userName, String password) {
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.username = userName;
        this.password = password;
    
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getlastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getAddress(){
        return address;
    }
        
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getState(){
        return state;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getZip(){
        return zip;
    }
    
    public void setZip(String zip){
        this.zip = zip;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getUserName(){
        return username;
    }
       
    public void setUserName(String userName){
        this.username = userName;
    }
    
    public String getPassword(){
        return password;
    }
        
    public void setPassword(String password){
        this.password = password;
    }
    
}
