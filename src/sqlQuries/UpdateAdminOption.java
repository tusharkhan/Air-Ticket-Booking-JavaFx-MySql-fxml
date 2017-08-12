package sqlQuries;

import com.DatabaseConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateAdminOption
{
    public UpdateAdminOption()
    {

    }


    //When Update All Airline Information
    public void updateAdminAll(String airNameText, String flightNumberText, String flightTimeText, String flightStatusText, String flightNameText, String dateText, String countryText) throws SQLException
    {
        String SQLUpdateAdmin = "UPDATE tbl_airplane SET country= ?, status = ?, flightName = ?, flightNum = ?, date = ?, time = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateAdmin))
            {
                statement.setString(1, countryText);
                statement.setString(2, flightStatusText);
                statement.setString(3, flightNameText);
                statement.setString(4, flightNumberText);
                statement.setString(5, dateText);
                statement.setString(6, flightTimeText);
                statement.setString(7, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//Update All Airline Information




    public void updateAdminFlightName(String airNameText, String flightNameText) throws SQLException
    {
        String SQLUpdateflightName = "UPDATE tbl_airplane SET  flightName = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateflightName))
            {
                statement.setString(1, flightNameText);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminAllWithoutCountry




    public void updateAdminFlightStatus(String airNameText, String flightStatusText) throws SQLException
    {
        String SQLUpdateStatus = "UPDATE tbl_airplane SET  status = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateStatus))
            {
                statement.setString(1, flightStatusText);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminFlightStatus


    public void updateAdminFlightNumber(String airNameText, String flightNumberText) throws SQLException
    {
        String SQLUpdateStatus = "UPDATE tbl_airplane SET  flightNum = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateStatus))
            {
                statement.setString(1, flightNumberText);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminFlightNumber



    public void updateAdminFlightTime(String airNameText, String flightTimeText) throws SQLException
    {
        String SQLUpdateStatus = "UPDATE tbl_airplane SET time = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateStatus))
            {
                statement.setString(1, flightTimeText);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminFlightTime


    public void updateAdminFlightDate(String airNameText, String flightDateText) throws SQLException
    {
        String SQLUpdateStatus = "UPDATE tbl_airplane SET date = ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateStatus))
            {
                statement.setString(1, flightDateText);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminFlightTime


    public void updateAdminFlightCountry(String airNameText, String country) throws SQLException
    {
        String SQLUpdateStatus = "UPDATE tbl_airplane SET country= ? WHERE airplane = ?";

        try (Connection connection = DatabaseConnection.getConnection())
        {
            try (PreparedStatement statement = connection.prepareStatement(SQLUpdateStatus))
            {
                statement.setString(1, country);
                statement.setString(2, airNameText);
                statement.executeUpdate();
            }
        }
        catch (SQLException e)
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Sql Error in Operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//updateAdminFlightTime
}//Main Class
