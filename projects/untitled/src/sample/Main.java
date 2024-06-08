package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

import java.awt.*;

public class Main extends Application {
    static Desktop desk = Desktop.getDesktop();
    static Robot fingers;
    {
        try {
            fingers = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    static boolean autoplay=false;
    Scanner sc = new Scanner(System.in);
    String name;
    void get_song_name(){
        System.out.println("Enter song name:");
        name = sc.nextLine();
        System.out.println(name);
    }

    void downloading_sound(String name){
        String n = name.replace(" ","+");
        try {
            desk.browse(URI.create("https://www.youtube.com/results?search_query="+n));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        long l =4000;
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(645,200);
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fingers.keyPress(KeyEvent.VK_SPACE);
        fingers.keyRelease(KeyEvent.VK_SPACE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(343, 50);
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_C);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_C);
        //fingers.mousePress(InputEvent.BUTTON1_MASK);
        //fingers.mouseRelease(InputEvent.BUTTON1_MASK);

        try {
            desk.browse(URI.create("https://mp3offline.org/"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(643,425);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_V);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_V);
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_V);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_V);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_ENTER);
        fingers.keyRelease(KeyEvent.VK_ENTER);
        fingers.mouseMove(580,400);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_ENTER);
        fingers.keyRelease(KeyEvent.VK_ENTER);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Main obj = new Main();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //text
        Text text = new Text();
        text.setFont(new Font(25));
        text.setX(50);
        text.setY(100);
        text.setText("Enter song name:");
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
            obj.downloading_sound(mname);
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
