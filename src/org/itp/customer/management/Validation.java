/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CHATHURAAKSHA
 */
public class Validation {
    
    public static boolean ValidFName(String text){
        
        boolean valid=false;
        
        for (int i = 0; i < text.length(); i++) {  
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch) || ch =='.' || ch == ' ') {                
                valid=true;   
            }
            else
                return false;            
        }
        return valid;       
    }
    public static boolean ValidLName(String text){
        
        boolean valid=false;
        
        for (int i = 0; i < text.length(); i++) {  
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || Character.isWhitespace(ch) || ch =='.' || ch == ' ') {                
                valid=true;   
            }
            else
                return false;            
        }
        return valid;       
    }
    public static boolean ValidNIC(String nic){
        boolean NIC=false;
        if (nic.length()==10) {
            
              for (int i = 0; i < 9; i++) {
                  if (!Character.isDigit(nic.charAt(i))) {
                      NIC=false;
                      return false;
                  }
                  else {
                      NIC=true;
                  }                                    
            } 
              if (NIC=true) {
                  if ((nic.charAt(9)=='v') || (nic.charAt(9)=='V')) {                      
                      return true;   
                  }
                  else{
                      return false;                      
                  }                  
            }
        }
        else
            return false;
         
        return false;
    }
    public static boolean ValidAddress(String text){
        
        boolean valid=false;
        
        for (int i = 0; i < text.length(); i++) {  
            char ch = text.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)|| Character.isWhitespace(ch) || ch ==',' || ch =='.' || ch =='/' || ch ==';' || ch ==':' || ch =='#' || ch =='\'') {                
                valid=true;                
            }
            else
                return false;            
        }
        if (valid) {
            return true;
        }
        return false;        
    }
    
    
public static boolean validateEmail(String Email){

                        boolean status =false;
                        String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
                        Pattern pattern =Pattern.compile(EMAIL_PATTERN);
                        Matcher matcher =pattern.matcher(Email);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;

            }

    
    
    
    public static boolean ValidDigits(String digit) {

        try {
            Double.parseDouble(digit);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }
    
 public static boolean validateTel(String Mobile){
         
         boolean status =false;
                        String phone_pattern = "\\d{3}\\d{3}\\d{4}";
                        Pattern pattern =Pattern.compile(phone_pattern);
                        Matcher matcher =pattern.matcher(Mobile);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;
    
     }
    



}
