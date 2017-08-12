package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class Account_info {
    @FXML
    private AnchorPane account_root;

    @FXML
    private JFXComboBox Combobox1;

    @FXML
    private JFXButton Button1;

    @FXML
    private String empty = new String();

    @FXML
    private void initialize() {

        Combobox1.getItems().addAll("Master Card", "PayPal", "Credit Card");
        Combobox1.setValue(empty);
    }

    @FXML
    private void account_method() throws IOException {

        if (Combobox1.getValue().equals(empty)) {

            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose A Option", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            AnchorPane Account_Details_root = FXMLLoader.load(getClass().getResource("../fxml/Account_Details.fxml"));
            account_root.getChildren().addAll(Account_Details_root);
        }

    }
}

