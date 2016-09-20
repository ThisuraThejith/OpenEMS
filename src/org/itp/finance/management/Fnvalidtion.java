package org.itp.finance.management;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Sumaduri 123
 */
public class Fnvalidtion {
    public static boolean ValidName(String text){
        
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
    
    

    public static boolean ValidDate(String date){ 

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } 
        catch (DateTimeException | ParseException e) {
            return false;
        }
    }
    
    
    public static boolean ValidDigits(String digit){
        boolean valid=false;
        for (int i = 0; i < digit.length(); i++) {
            char ch =digit.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
            else{
                valid=true;
            }
        }
        if (valid) {
            return true;
        }
        else
            return false;
    }
}


