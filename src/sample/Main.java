package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/sample.fxml"));
        primaryStage.setTitle("Airplane Ticket System Online");
        primaryStage.setScene(new Scene(root, 600.0, 337.0));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
