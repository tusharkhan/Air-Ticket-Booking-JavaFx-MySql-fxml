package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class AdminLogin
{
    @FXML
    private TextField email;

    @FXML
    private TextField pass;

    @FXML
    private AnchorPane adminLogin;

    @FXML
    private void adminLogin() throws IOException
    {
        if (email.getText().isEmpty() || pass.getText().isEmpty())
        {
            final JPanel panel = new JPanel();

            JOptionPane.showMessageDialog(panel, "Field must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!email.getText().isEmpty() && !pass.getText().isEmpty())
        {
            if (!isValidEmailAddress(email.getText()))
            {
                final JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Enter a Valid E-mail", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if (email.getText().equals("admin@gmail.com") && pass.getText().equals("admin"))
                {
                    AnchorPane update = FXMLLoader.load(getClass().getResource("../fxml/AdminUpdate.fxml"));
                    adminLogin.getChildren().setAll(update);
                }
                else if (email.getText().equals("info@gmail.com") && pass.getText().equals("info"))
                {
                    AnchorPane update = FXMLLoader.load(getClass().getResource("../fxml/AdminUpdate.fxml"));
                    adminLogin.getChildren().setAll(update);
                }
                else
                {
                    final JPanel panel = new JPanel();

                    JOptionPane.showMessageDialog(panel, "Enter or Password Not Matched", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    /*
     * Validation Function
     * Validate E-mail
     */
    private boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
}
