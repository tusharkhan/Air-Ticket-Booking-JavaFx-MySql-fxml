package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import javax.swing.*;
import java.io.IOException;

public class UserProfile {


    //Making Object of User_Loging_SingUp
    UserLoginSinup UserData = new UserLoginSinup();



    @FXML
    protected Text textField_Name;

    @FXML
    protected Text textField_Email;

    @FXML
    protected Text textField_Country;

    @FXML
    protected Text textField_Contact;

    @FXML
    protected JFXButton nextButton,Edit_Button;

    @FXML
    protected AnchorPane User_profile_root;



    //Storing Edited Contact Number in Variables
    @FXML protected String newContact;


    //Edit Contact Number
    @FXML protected void edit_Contact_number()
    {
        JPanel panel= new JPanel();
        newContact= JOptionPane.showInputDialog(panel,"New Contact Number");
        textField_Contact.setText(newContact);
    }




    //Initialize User_loging_Singup_data
    @FXML
    public void initialize(){

        textField_Name.setText(UserData.name);
        textField_Email.setText(UserData.Email);
        textField_Country.setText(UserData.Country);
        textField_Contact.setText(UserData.Contact);
    }


    @FXML
    protected void Profile_button_Method() throws IOException {
        AnchorPane Location_root = FXMLLoader.load(getClass().getResource("../fxml/Location.fxml"));
        User_profile_root.getChildren().addAll(Location_root);
    }


}
