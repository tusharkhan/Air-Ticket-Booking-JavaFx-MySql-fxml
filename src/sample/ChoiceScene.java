package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;


import javax.swing.*;
import java.io.IOException;

public class ChoiceScene
{
    @FXML private String empty= new String();
    @FXML
    private ComboBox combo;

    @FXML
    private AnchorPane choiceOption;

    @FXML private void initialize()
    {
        
        combo.getItems().addAll("Admin","User");
        combo.setValue(empty);

    }

    @FXML
    public void comboSelect() throws IOException {

        if (combo.getValue().equals("Admin"))
        {
            AnchorPane adminLogin = FXMLLoader.load(getClass().getResource("../fxml/AdminLogin.fxml"));
            choiceOption.getChildren().setAll(adminLogin);
        }
        else if (combo.getValue().equals("User"))
        {
            AnchorPane User_login_singup_root = FXMLLoader.load(getClass().getResource("../fxml/UserLoginSinup.fxml"));
            choiceOption.getChildren().setAll(User_login_singup_root);
        }
        else if (combo.getValue().equals(empty)&&combo.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose A Option", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
}
