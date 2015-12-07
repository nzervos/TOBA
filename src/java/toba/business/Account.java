/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.business;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account implements Serializable {
    
    public enum accountType{Savings, Checking};
    private Double startBalance;
    private Double runningBalance;
    private Double endBalance;
    private String userName;
    private accountType type;
    
    public Account(){
        
        runningBalance = 0.0;
        startBalance = 0.0;
        endBalance = 0.0;
        userName = "";
    }
    
    public Account(Double startB, String userN, accountType accType) {
    
        this.startBalance = startB;
        this.userName = userN;
        this.type = accType;   
        this.runningBalance = startB;
}
    
    public accountType getAccountType(){
        return type;
    }
    
    public void setAccountType(accountType accType){
        this.type = accType;
    }
    
    public Double getStartBalance(){
        return startBalance;
    }
    
    public void setStartBalance(Double startB){
        this.startBalance = startB;
    }
    
    public Double getEndBalance(){
        return endBalance;
    }
    
    public void setEndBalance(){
        this.endBalance = runningBalance;
    }
    
    public String getUserName(){
        return userName;
    }
       
    public void setUserName(String userN){
        this.userName = userN;
    }
    
    public Double credit(Double cred){
        runningBalance += cred;
        return runningBalance;
    }
    
    public Double debit(Double deb){
        runningBalance -= deb;
        return runningBalance;
    }
    
    
}
