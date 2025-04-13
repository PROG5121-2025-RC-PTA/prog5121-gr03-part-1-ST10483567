/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Registration {

    private static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter Username
        System.out.println("Enter your username");
        String userName = scanner.nextLine();
        
        if (checkUsername(userName)) {
            System.out.println("welcome " + userName + " it is great to see you");
        }
        else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters long");
        }

        //enter password
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        if (checkPasswordComplexity (password)){
            System.out.println("Password successfully captured");
        }
        else {
            System.out.println("Password is not correctly formatted, please ensure that password contains at least eight characters, a capital letter, a number and a special character.");
        }
        //Enter cell number
        System.out.println("Enter your South African cellphone number (e.g. +27833541899)");
        String cellNumber = scanner.nextLine();
        if (checkCellphoneNumber(cellNumber)){
            System.out.println("Cell phone number successfully captured");
        }
        else{
            System.out.println("Cell phone number  incorrectly formatted or does not contain international code");

        }
        String registeredUsername = userName;
        String registeredpassword = password;
        scanner.close();
    }
    //Username conditions
    public static boolean checkUsername(String userName){
        if (userName.contains("_") && userName.length()<=5){
            return true;
        }
        else {
            return false;
        }
        
    }
    //Password conditions
    public static boolean checkPasswordComplexity(String password){
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        
        if(password.length()<8){
            return false;
        }
        for (int i=0; i < password.length(); i++){
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                hasCapital = true;
            }
            if(Character.isDigit(c)){
                hasNumber = true;
            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecialChar = true;
            }
        }
        return hasCapital && hasNumber && hasSpecialChar;
    }
    //Cell number conditions
    //Phone number validation method developed with guidance from ChatGPT 
    //OpenAI.(2025). ChatGPT(April 10 version).https://chatgpt.com/c/67f832f3-9424-8002-9024-b2da62f7d8f9
    public static boolean checkCellphoneNumber(String cellNumber){
        if (cellNumber.length() !=12 ){
            return false;
        }
        if (!cellNumber.startsWith("+27")){   
        return false;
        }
        for (int i=3; i<cellNumber.length(); i++){
            char c = cellNumber.charAt(i);
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
        
}
