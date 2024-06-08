package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;


public class tester extends Application {

    public void start(Stage primaryStage) throws Exception{
        tester obj = new tester();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //text
        Text text = new Text();
        text.setFont(new Font(25));
        text.setX(50);
        text.setY(100);
        text.setText("Choose lesson");
        text.setFill(Color.rgb(0,255,51));

        //inp
        TextField sc = new TextField();
        sc.setStyle("-fx-background-color : #808080");
        sc.setFont(new Font(20));
        //button
        Button click = new Button("Press me");
        click.setStyle("-fx-background-color : #808080");
        //vbox
        VBox v = new VBox();
        v.setSpacing(10);
        v.setStyle("-fx-background-color : #ff000000");
        //text doing stuff
        Text texting = new Text();
        texting.setFill(Color.rgb(0,255,51));
        texting.setFont(new Font(25));
        texting.setX(50);
        texting.setY(100);
        //stage
        primaryStage.setTitle("'cause y not!™ Music Downloader");
        Scene scene = new Scene(v,300,275);
        scene.setFill(Color.rgb(0,0,0));
        primaryStage.setScene(scene);
        primaryStage.show();
        v.getChildren().addAll(text,sc,click,texting);
        click.setOnAction(value ->  {
            text.setText("Please be patient");
            String mname =sc.getText();
            //obj.downloading_sound(mname);
        });

    }
    public static void main(String[] args){
        launch();
    }
}
