/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MC
 */
public class Validations {
    
    public static boolean ValidateNames(String name)
    {
        String pattern = "^[a-zA-Z\\s]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(name);
        return match.matches();
    }
    
    public static boolean ValidateUserName(String userName)
    {
        String pattern = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(userName);
        return match.matches();
    }
    
    public static boolean ValidateIntegerFields(String fieldValue)
    {
        String pattern = "^[1-9]{0,2}";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(fieldValue);
        return match.matches();
    }
    
    public static boolean ValidateEmail(String email)
    {
        String pattern ="[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(email);
        return match.matches();
    }
    
    public static boolean ValidatePhone(String phone)
    {
        String pattern = "^[0-9]{10}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(phone);
        return match.matches();
    }
    
}
