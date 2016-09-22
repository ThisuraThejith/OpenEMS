/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorynew1;

/**
 *
 * @author ASUS
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author KAVINDA
 */
public class Validation {

    
    
    
    public static boolean validateEmail(String email){

                        boolean status =false;
                        String EMAIL_PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
                        Pattern pattern =Pattern.compile(EMAIL_PATTERN);
                        Matcher matcher =pattern.matcher(email);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;

            }

    public static boolean validateTel(String tel){
         
         boolean status =false;
                        String phone_pattern = "\\d{3}\\d{3}\\d{4}";
                        Pattern pattern =Pattern.compile(phone_pattern);
                        Matcher matcher =pattern.matcher(tel);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;
    
     }
    
    
    public static boolean validateLetters(String name){
    
    boolean status = false;    
    String regx = "^[\\p{L} .'-]+$";
    Pattern pattern = Pattern.compile(regx);
      
        
    Matcher matcher = pattern.matcher(name);
    status = matcher.matches();
                        return status;
    

}
    
    public static boolean validatePrice(String price){
                        boolean status =false;
                        String qty_pattern = "^[+]?[0-9]*\\.?[0-9]+";
                        Pattern pattern =Pattern.compile(qty_pattern);
                        Matcher matcher =pattern.matcher(price);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;
    
    }
    
   public static boolean validateQty(String qty){
                        boolean status =false;
                        String qty_pattern = "^[+]?[0-9]+";
                        Pattern pattern =Pattern.compile(qty_pattern);
                        Matcher matcher =pattern.matcher(qty);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;
    
    }
   
   /* public static boolean validateNIC(String NIC){
                        boolean status =false;
                        String nic_pattern = "\\d{9}[V|v|x|X]";
                        Pattern pattern =Pattern.compile(nic_pattern);
                        Matcher matcher =pattern.matcher(NIC);
                        if(matcher.matches())
                        {

                        status = true;
                        }
                        else{

                         status = false;
                        }
                        return status;
    
    }
  */
    
    
}

    

