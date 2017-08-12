package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class Journey_Type {

    @FXML
    public AnchorPane Location_root;

    @FXML
    private AnchorPane journey_root;
    @FXML
    private JFXComboBox journey_ComboBox;
    @FXML
    private JFXButton Next_Button;
    @FXML
    private JFXButton Back_Button;

    @FXML private String empty=new String();

    @FXML private void initialize()
    {
        journey_ComboBox.getItems().addAll("Break Journey","Non-Break Journey");
        journey_ComboBox.setValue(empty);
    }
    @FXML
    private void next_method() throws IOException
    {

        if(journey_ComboBox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose A Option", "Error", JOptionPane.ERROR_MESSAGE);
        }


        else
        {
            AnchorPane Flight_Schedle_root = FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
            journey_root.getChildren().setAll(Flight_Schedle_root);
        }
    }

    @FXML
    private void back_method() throws IOException
    {
        AnchorPane Location_root = FXMLLoader.load(getClass().getResource("../fxml/Location.fxml"));
        journey_root.getChildren().setAll(Location_root);
    }

}
