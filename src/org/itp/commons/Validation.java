/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author THISURA THEJITH
 */
public class Validation {
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
    
    
    public static boolean ValidDigits(String digit) {

        try {
            Double.parseDouble(digit);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }
    
    public static boolean FutureDate(Date comDate){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentdate= new Date();
        
        
        int difference = (comDate.compareTo(currentdate));
            
            if (difference>0) {
                return true;
            }
            else if (difference<=0)
                return false;
            return false;
    }
    
    public static boolean ValidAge(Date comDate){
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentdate= new Date();
        
        
        int difference = (currentdate.compareTo(comDate));
            
            if (difference>18||difference==18) {
                return true;
            }
            else if (difference<18)
                return false;
            return false;
    }
    
    public static boolean ValidContactNo(String text){
     boolean valid =false;
     
     if (text.length()==10) {
         for (int i = 0; i < 10; i++) {
             char ch = text.charAt(i);
             if (!Character.isDigit(ch)) {
                 return false;                 
             }
             else
                 valid = true;
         }
     }
     if (valid) {
         return  true;
     }        
     return false;
    }
            
    public static boolean validateEmail(String Email){

                        boolean status =false;
                        String EMAIL_PATTERN = "^[a-z0-9]+@[a-z]+\\.[a-zA-Z]{2,6}$";
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
    
    public static boolean ValidPercentage(String digit) {

        if(ValidDigits(digit)){
            if(Double.parseDouble(digit)<100){
                return true;
            }
        }
        return false;
    }
}


