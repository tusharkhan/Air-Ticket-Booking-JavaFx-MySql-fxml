/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlQuries;

import com.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class for Select Query
 * @author Tushar Khan
 */
public class Select 
{
    private int userId;
    private String UserEmail;
    private String UserContact;
    private String UserCountry;
    private String UserName;

    public String getUserEmail()
    {
        return UserEmail;
    }

    public void setUserEmail(String userEmail)
    {
        UserEmail = userEmail;
    }

    public String getUserContact()
    {
        return UserContact;
    }

    public void setUserContact(String userContact)
    {
        UserContact = userContact;
    }

    public String getUserCountry()
    {
        return UserCountry;
    }

    public void setUserCountry(String userCountry)
    {
        UserCountry = userCountry;
    }

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String userName)
    {
        UserName = userName;
    }



    public int getUserId()
    {
        return userId;
    }

    private void setUserId(int userId)
    {
        this.userId = userId;
    }


    public Select()
    {
        
    }
    
    public String selectUserInfo(String email) throws SQLException
    {
        String SQLSelect = "SELECT * FROM tbl_user WHERE email=?";

        try(
                Connection connection = DatabaseConnection.getConnection();
            
                PreparedStatement statement = connection.prepareStatement(SQLSelect)
           )
        {
            statement.setString(1, email);
            ResultSet result = statement.executeQuery();

            String re = null;
            while (result.next())
            {
                //System.out.println(result.getString("email"));
                re =  result.getString("email");
                setUserId(result.getInt("id"));
                setUserEmail(re);
                setUserName(result.getString("uname"));
                setUserContact(result.getString("phone"));
                setUserCountry(result.getString("country"));
            }
            return re;
        }
    }//Function for selectUserInfo



    public String selectUserPass(String passwodr) throws SQLException
    {
        String SQLSelect = "SELECT * FROM tbl_user WHERE pass=?";

        try(
                Connection connection = DatabaseConnection.getConnection();

                PreparedStatement statement = connection.prepareStatement(SQLSelect)
        )
        {
            statement.setString(1, passwodr);
            ResultSet result = statement.executeQuery();

            String re = null;
            while (result.next())
            {
                //System.out.println(result.getString("email"));
                re =  result.getString("pass");
            }
            return re;
        }
    }//Function for selectUserInfo

}//Main Class
