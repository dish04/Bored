package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {


    //stackpane =new StackPane();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("How much??");
        primaryStage.setScene(new Scene(root, 700,700));
        StackPane root1=new StackPane();
        Button b = new Button();
        root1.getChildren().add(b);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
