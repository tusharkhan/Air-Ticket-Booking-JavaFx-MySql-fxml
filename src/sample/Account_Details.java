package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class Account_Details {

    @FXML
    private AnchorPane Account_Details_root;

    @FXML
    private JFXButton Button1;
    @FXML
    private JFXTextField first_name;

    @FXML
    private JFXTextField last_name;

    @FXML
    private JFXTextField email_text;

    @FXML
    private JFXTextField account_text;

    @FXML
    private JFXTextField Contact;

    @FXML
    private void account_information_method() throws IOException {


        if(first_name.getText().isEmpty())
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"First Name can not Empty","Error",JOptionPane.ERROR_MESSAGE);


        }

        else if(last_name.getText().isEmpty())
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"Last Name can not Empty","Error",JOptionPane.ERROR_MESSAGE);


        }
        else if(!isValidEmailAddress(email_text.getText()))
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"Please Enter a Valid E-mail","Error",JOptionPane.ERROR_MESSAGE);


        }
        else if(account_text.getText().isEmpty())
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"Account Number can not Empty","Error",JOptionPane.ERROR_MESSAGE);


        }
        else if(Contact.getText().isEmpty())
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"Contact Number can not Empty","Error",JOptionPane.ERROR_MESSAGE);


        }
        else
        {

            JPanel panel1= new JPanel();
            JOptionPane.showMessageDialog(panel1,"A Confirmation Link has sent to \nyour E-Mail","Payment Successful",JOptionPane.INFORMATION_MESSAGE);


        }
    }

    private boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }


   @FXML
    private void Exit_method()
    {
        System.exit(5);

    }


}
