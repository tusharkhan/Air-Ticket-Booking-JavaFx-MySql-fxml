package sample;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sqlQuries.UpdateAdminOption;

import javax.swing.*;
import java.sql.SQLException;

public class AdminUpdate
{
    //Airplane Name CheckBox
    @FXML
    private CheckBox airplaneName;

    //Flight Number CheckBox
    @FXML
    private CheckBox flightNumber;

    //Flight Time CheckBox
    @FXML
    private CheckBox flightTime;

    //Flight Status CheckBox
    @FXML
    private CheckBox flightStatus;

    //Gate Number CheckBox
    @FXML
    private CheckBox flightName;

    //Date Number CheckBox
    @FXML
    private CheckBox date;

    //Date Number CheckBox
    @FXML
    private CheckBox country;







    //Airplane Name Text
    @FXML
    private TextField airNameText;

    //Flight Number Text
    @FXML
    private TextField flightNumberText;

    //Flight Time Text
    @FXML
    private TextField flightTimeText;

    //Flight Status Text
    @FXML
    private TextField flightStatusText;

    //Gate Number Text
    @FXML
    private TextField flightNameText;

    //Date Number Text
    @FXML
    private TextField dateText;

    //Date Number Text
    @FXML
    private TextField countryText;


    UpdateAdminOption update = new UpdateAdminOption();



    @FXML
    private void updateAirlineInfo() throws SQLException {
        if (!airplaneName.isSelected())
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Airplane Name must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if (flightNumber.isSelected() && airplaneName.isSelected() && flightTime.isSelected() && flightStatus.isSelected() && flightName.isSelected() && date.isSelected())
            {
                update.updateAdminAll(airNameText.getText(), flightNumberText.getText(), flightTimeText.getText(), flightStatusText.getText(), flightNameText.getText(), dateText.getText(), countryText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Successfully Updated", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            }

            if (flightNumber.isSelected() && airplaneName.isSelected())
            {
                if (flightNumberText.getLength() <= 5)
                {
                    update.updateAdminFlightNumber(airNameText.getText(), flightNumberText.getText());
                    final JPanel panel = new JPanel();

                    JOptionPane.showMessageDialog(panel, "Flight Number is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            if (flightTime.isSelected() && airplaneName.isSelected())
            {
                update.updateAdminFlightTime(airNameText.getText(), flightTimeText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Flight Time is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);


            }

            if (flightStatus.isSelected() && airplaneName.isSelected())
            {
                //MySql Update Function
                update.updateAdminFlightStatus(airNameText.getText(), flightStatusText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Flight Status is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);


            }

            if (flightName.isSelected() && airplaneName.isSelected())
            {
                //MySql Update Function
                update.updateAdminFlightName(airNameText.getText(), flightNameText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Flight Name is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);

            }

            if (date.isSelected() && airplaneName.isSelected())
            {
                update.updateAdminFlightDate(airNameText.getText(), dateText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Flight Date is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            }


            if (country.isSelected() && airplaneName.isSelected())
            {
                update.updateAdminFlightCountry(airNameText.getText(), countryText.getText());

                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Country is Updated\n", "Successfully", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    @FXML
    private void Exit()
    {
        System.exit(5);
    }
}
