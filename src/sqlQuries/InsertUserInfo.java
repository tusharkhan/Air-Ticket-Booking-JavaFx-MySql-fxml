/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlQuries;

import com.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author optima s
 */
public class InsertUserInfo 
{
    //Constructor of InsertUserInfo
    public InsertUserInfo()
    {
        
    }
    
//    public void insertUserInfo(String userName, String email, String phone, String country)
//    {
//        String SQLQuery = "INSERT INTO tbl_user (uname, email, phone, country, pass)"+" VALUES (?, ?, ?, ?, ?)";
//        try(
//                //getting Connection
//               Connection connect = DatabaseConnection.getConnection();
//                //Query Statement
//               PreparedStatement statement = connect.prepareStatement(SQLQuery)
//           )
//        {
//            statement.setString(1, userName);
//            statement.setString(2, email);
//            statement.setString(3, phone);
//            statement.setString(4, country);
//            statement.setString(5, "12345");
//
//            statement.executeUpdate(SQLQuery);
//        }
//        catch(SQLException err)
//        {
//            System.err.println(err);
//        }
//    }

    public void insert(String uname, String email, String country, String phone)
    {
        try
        {
            // create a mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/test";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

            // the mysql insert statement
            String query = " insert into tbl_user (uname, fName, lName, email, account, phone, country, pass)"
                    + " values (?, ?, ?, ?, ?, ?, ? ,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, uname);
            preparedStmt.setString (2, "NULL");
            preparedStmt.setString (3, "NULL");
            preparedStmt.setString (4, email);
            preparedStmt.setString (5, "NULL");
            preparedStmt.setString (6, phone);
            preparedStmt.setString (7, country);
            preparedStmt.setString (8, "12345");

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
