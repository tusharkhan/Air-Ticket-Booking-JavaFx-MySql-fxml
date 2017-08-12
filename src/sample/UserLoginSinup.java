package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sqlQuries.InsertUserInfo;
import sqlQuries.Select;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLException;

public class UserLoginSinup
{
    /*
     * User Login Sign up Controller
     * User Login Part
     */

    //User E-mail
    @FXML
    private TextField loginEmail;

    //User Password
    @FXML
    private TextField loginPass;

    /*
     * User Login Sign up Controller
     * User Sign up Part
     */

    //User Name
    @FXML
    private TextField signupName;

    //User E-mail
    @FXML
    private TextField signupEmail;

    //User Country
    @FXML
    private TextField signupCountry;

    @FXML
    private TextField signupContact;

    //Id of AnchorPan
    @FXML private AnchorPane User_login_singup_root;

    //Input Storing Variables
    @FXML
    static String name;

    @FXML
    static String Email;

    @FXML
    static String Country;

    @FXML
    static String Contact;


    //Input Storing Variables
    @FXML
    static String nameLog;

    @FXML
    static String EmailLog;

    @FXML
    static String CountryLog;

    @FXML
    static String ContactLog;


    Select select = new Select();
    InsertUserInfo insert = new InsertUserInfo();



    /*
     * FXML Private Void Function
     * User Login Function
     * @return void
     */
    @FXML
    private void userLogin() throws IOException, SQLException {

        /*
         * Checking for E-mail And Password
         * if it is Empty
         */
        if (loginEmail.getText().isEmpty() || loginPass.getText().isEmpty())
        {
            if (loginEmail.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "E-mail must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (loginPass.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Password must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else
        {
            if (!isValidEmailAddress(loginEmail.getText()))
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Please Enter a Valid E-mail", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String mail = select.selectUserInfo(loginEmail.getText());
                String pass  = select.selectUserPass(loginPass.getText());

                if(mail.equals(loginEmail.getText()) && pass.equals(loginPass.getText()))
                {
                    AnchorPane User_profile_root= FXMLLoader.load(getClass().getResource("../fxml/Location.fxml"));
                    User_login_singup_root.getChildren().setAll(User_profile_root);
                }
            }
        }
    }//User Login Function

    /*
     * FXML Private Void Function
     * User Sign up Function
     * @return void
     */

    @FXML
    protected void userSignup () throws IOException {

        //Storing data in Variables

        name=signupName.getText();
        Email=signupEmail.getText();
        Country=signupCountry.getText();
        Contact=signupContact.getText();


        /*
         * Checking for Name, E-mail And Country
         * if it is Empty
         */
        if (signupName.getText().isEmpty() || signupEmail.getText().isEmpty() || signupCountry.getText().isEmpty() || signupContact.getText().isEmpty())
        {
            if (signupName.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Name must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (signupEmail.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "E-mail must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (signupCountry.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Country must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (signupContact.getText().isEmpty())
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Contact must not be EMPTY", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }//
        else
        {

            if (!isValidEmailAddress(signupEmail.getText()))
            {
                JPanel panel = new JPanel();

                JOptionPane.showMessageDialog(panel, "Please Enter a Valid E-mail", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                insert.insert(signupName.getText(), signupEmail.getText(), signupCountry.getText(), signupContact.getText());

                AnchorPane User_profile_root= FXMLLoader.load(getClass().getResource("../fxml/UserProfile.fxml"));
                User_login_singup_root.getChildren().setAll(User_profile_root);

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
