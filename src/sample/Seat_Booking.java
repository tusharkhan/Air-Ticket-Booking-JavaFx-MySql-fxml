package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;

public class Seat_Booking {

    @FXML private AnchorPane Seat_Booking_root;
    @FXML protected CheckBox A1,A2,A3,A4,A5;
    @FXML public  Label lebel1,lebel2;
    @FXML
    protected Text text1;
    @FXML private Button Choose_back_button;

    @FXML protected void set_text()
    {

        text1.setText("A1");


    }

    @FXML private  void seat_chosse_method() throws IOException {


        AnchorPane seat_ticket_root= FXMLLoader.load(getClass().getResource("../fxml/SeatTicketAmount.fxml"));
        Seat_Booking_root.getChildren().setAll(seat_ticket_root);
    }

    @FXML private  void seat_chosse_back_method() throws IOException
    {
        AnchorPane Flight_Schedle_root= FXMLLoader.load(getClass().getResource("../fxml/FlightSchedle.fxml"));
        Seat_Booking_root.getChildren().setAll(Flight_Schedle_root);
    }
}



