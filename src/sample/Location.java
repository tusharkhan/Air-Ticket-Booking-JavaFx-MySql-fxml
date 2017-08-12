package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.io.IOException;

public class Location {

    @FXML
    public AnchorPane Location_root;


    @FXML
    private JFXComboBox Current_location_combobox, Destination_combobox;


    @FXML
    protected JFXButton Done_button;


    @FXML private String empty=new String();

    //Location Initialize
    @FXML
    protected void initialize() throws IOException {

        Current_location_combobox.getItems().add("Bangladesh");
        Current_location_combobox.getItems().add("America");
        Current_location_combobox.getItems().add("Japan");
        Current_location_combobox.getItems().add("England");
        Current_location_combobox.getItems().add("Australia");
        Current_location_combobox.getItems().add("India");

        Destination_combobox.getItems().add("Germany");
        Destination_combobox.getItems().add("France");
        Destination_combobox.getItems().add("Italy");
        Destination_combobox.getItems().add("Canada");
        Destination_combobox.getItems().add("Egypt");
        Destination_combobox.getItems().add("Dubai");


        Current_location_combobox.setValue(empty );
        Destination_combobox.setValue(empty);
    }




    @FXML
    public void set_location_Method() throws IOException {

        if(Current_location_combobox.getValue().equals(empty)&&Destination_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose A Option", "Error", JOptionPane.ERROR_MESSAGE);


        }



        else if(Current_location_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose your\nCurrent Location", "Error", JOptionPane.ERROR_MESSAGE);


        }
        else if(Destination_combobox.getValue().equals(empty))
        {
            JPanel panel1 = new JPanel();

            JOptionPane.showMessageDialog(panel1, "Choose your Destination", "Error", JOptionPane.ERROR_MESSAGE);


        }

       if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("Germany"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("France"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
       else if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("Italy"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
       else if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("Canada"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
       else if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("Egypt"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
       else if (Current_location_combobox.getValue().equals("Bangladesh") && Destination_combobox.getValue().equals("Dubai"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("Germany"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("France"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("Italy"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("Canada"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("Egypt"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("America") && Destination_combobox.getValue().equals("Dubai"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }

        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("Germany"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("France"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("Italy"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("Canada"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("Egypt"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
        else if (Current_location_combobox.getValue().equals("Japan") && Destination_combobox.getValue().equals("Dubai"))
        {

            AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
            Location_root.getChildren().setAll(journey_root);
        }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("Germany"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("France"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("Italy"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("Canada"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("Egypt"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("England") && Destination_combobox.getValue().equals("Dubai"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("Germany"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("France"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("Italy"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("Canada"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("Egypt"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("Australia") && Destination_combobox.getValue().equals("Dubai"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("Germany"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("France"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("Italy"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("Canada"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("Egypt"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
       else if (Current_location_combobox.getValue().equals("India") && Destination_combobox.getValue().equals("Dubai"))
       {

           AnchorPane journey_root = FXMLLoader.load(getClass().getResource("../fxml/Journey_Type.fxml"));
           Location_root.getChildren().setAll(journey_root);
       }
    }

}

