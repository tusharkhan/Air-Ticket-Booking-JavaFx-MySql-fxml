/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlQuries;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

/**
 * Class for Validate Information
 * @author Tushar Khan
 */
public class Validate 
{
    
    /*
    * Function for Validate Firsr NAme
    * Public Function
    * @param FastName
    * @return boolean
    */
    public boolean verifyFastName(String FastName)
    {
        FastName = FastName.trim();

        if(FastName == null || FastName.isEmpty() || !FastName.matches("[a-zA-Z]*"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }//verifyFastName
    
    
    
    
    /*
    * Function for Validate Last NAme
    * Public Function
    * @param LastName
    * @return boolean
    */
    public boolean verifyLastName(String LastName)
    {
        LastName = LastName.trim();

        if(LastName == null || LastName.isEmpty() || !LastName.matches("[a-zA-Z]*"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }//verifyLastName
    
    
    
    /*
    * Function for Validate email
    * Public Function
    * @param email
    * @return boolean
    */
    public boolean verifyEmail(String email)
    {
        email = email.trim();

        if(email == null || email.isEmpty() || !email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    
    /*
    * Function for Spetial Charecters
    * Public Function
    * @param string
    * @return String
    */
    public String escapeSpetialCharecters(String string)
    {
        return string.replaceAll("(?=[]\\[+&|!(){}^\"~*?:\\\\-])", "\\\\");
    }
    
    
    
    /*
    * Function for Spetial Charecters
    * Public Function
    * @param string
    * @return String
    */
    public boolean isInt(String text)
    {
        try
        {
            int ans = Integer.parseInt(text);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    
}//Main Class
