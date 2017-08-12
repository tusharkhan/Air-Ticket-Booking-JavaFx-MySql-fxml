package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class FlightSchedle {


    @FXML private AnchorPane Flight_Schedle_root;
    @FXML private CheckBox dis;




    @FXML public  void flight_table() throws IOException {
        AnchorPane Seat_Booking_root= FXMLLoader.load(getClass().getResource("../fxml/Seat_Booking.fxml"));
        Flight_Schedle_root.getChildren().setAll(Seat_Booking_root);

    }

    @FXML public void flight_table_button() throws IOException
    {
        AnchorPane journey_root= FXMLLoader.load(getClass().getResource("../fxml/Search.fxml"));
         Flight_Schedle_root.getChildren().setAll(journey_root);
    }

}
