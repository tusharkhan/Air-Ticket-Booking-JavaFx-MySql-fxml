package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;



public class SeatTicketAmount {

    @FXML public Label lebel1,lebel2;
    @FXML private AnchorPane seat_ticket_root;
    @FXML private Button Undo_button;

    @FXML private void confirm_method() throws IOException {


        AnchorPane account_root= FXMLLoader.load(getClass().getResource("../fxml/Account_info.fxml"));
        seat_ticket_root.getChildren().setAll(account_root);

    }

    @FXML private void undo_method() throws IOException
    {
        AnchorPane Seat_Booking_root= FXMLLoader.load(getClass().getResource("../fxml/Seat_Booking.fxml"));
        seat_ticket_root.getChildren().setAll(Seat_Booking_root);
    }
}
