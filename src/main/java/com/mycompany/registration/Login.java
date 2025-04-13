/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

import static com.mycompany.registration.Registration.checkPasswordComplexity;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
   
    
    private String registeredUsername;
    private String registeredPassword;
    private boolean loginStatus = false;
    
    public String registerUser(String userName, String password){
        if(!checkUserName(userName)){
            return "Username is incorrectly formatted.";
        }
        if(!checkPasswordComplexity(password)){
            return "Password does not meet complexity requirements";
        }
        registeredUsername = userName;
        registeredPassword = password;
        
        return "User has been registered sucessfully";
    }
    public boolean loginUser(String inputUserName,String inputPassword){
        if(inputUserName.equals(registeredUsername) && inputPassword.equals(registeredPassword)){
            loginStatus = true;
            return true;
        }
        else{
            loginStatus = false;
            return false;
        } 
    }
    public String returnLoginStatus(){
        if (loginStatus){
            return "A successful login";
        }
        else{
            return "A failed login";
        }
    }

    private boolean checkUserName(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
