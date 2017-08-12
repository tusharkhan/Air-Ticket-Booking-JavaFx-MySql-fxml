/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlQuries;

import com.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author optima s
 */
public class UpadateUserInfo 
{
    public UpadateUserInfo()
    {

    }


    //When Update All Information
    public void updateUserAll(int id, String firstName, String lastName, String email) throws SQLException
    {
        String SQLupdateUserAll = "UPDATE tbl_user SET fName=?,lName= ?, email=?, date = NOW() WHERE uid = ?";
        
        try(
                Connection connection = DatabaseConnection.getConnection();
            
                PreparedStatement statement = connection.prepareStatement(SQLupdateUserAll);
           )
        {
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.println("Success Updating");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    //When Update Last NAme Information
    public void updateUserLastName(int id, String laName) throws SQLException
    {
        String SQLupdateUserLastName = "UPDATE tbl_user SET lName=? WHERE uid = ?";
        
        try(
                Connection connectforName = DatabaseConnection.getConnection();
            
                PreparedStatement statementforName = connectforName.prepareStatement(SQLupdateUserLastName);
           )
        {
            statementforName.setString(1, laName);
            statementforName.setInt(2, id);
            statementforName.executeUpdate();
            System.out.println("Success Updating");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //When Update Last NAme Information
    public void updateUserMail(int id, String mail) throws SQLException {
        String SQLupdateUserMail = "UPDATE tbl_user SET email=? WHERE uid = ?";
        
        

        try(
                Connection connectforName = DatabaseConnection.getConnection();
            
                PreparedStatement statementforName = connectforName.prepareStatement(SQLupdateUserMail);
           )
        {
            statementforName.setString(1, mail);
            statementforName.setInt(2, id);
            statementforName.executeUpdate();
            System.out.println("Success Updating");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    //When Update First NAme Information
    public void updateUserFirstName(int id, String fname) throws SQLException {
        String SQLupdateUserFirstName = "UPDATE tbl_user SET fName=? WHERE uid = ?";
        
        
        try(
                Connection connectforName = DatabaseConnection.getConnection();
            
                PreparedStatement statementforName = connectforName.prepareStatement(SQLupdateUserFirstName);
           )
        {
            statementforName.setString(1, fname);
            statementforName.setInt(2, id);
            statementforName.executeUpdate();
            System.out.println("Success Updating");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
