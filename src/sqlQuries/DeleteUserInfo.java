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
public class DeleteUserInfo 
{
    String SQLDeleteQuery = "DELETE FROM tbl_user WHERE uid = ?";
    public DeleteUserInfo()
    {

    }

    //Delete Row
    public void deleteRow(int id)
    {

        try(
                Connection connection = DatabaseConnection.getConnection();
            
                PreparedStatement statement = connection.prepareStatement(this.SQLDeleteQuery);
           )
        {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Success Deleting");
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
