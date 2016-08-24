/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;

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
    public static boolean ValidNic(String nic){
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
    
}
