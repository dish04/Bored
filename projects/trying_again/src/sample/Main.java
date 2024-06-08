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
        text.setText("Enter song name:");
        name = sc.nextLine();

        text.setText(name);
    }
    Text text = new Text();
    void downloading_sound(String name,int x,int y,int x1,int y1,int x2,int y2){
        String n = name.replace(" ","+");
        try {
            desk.browse(URI.create("https://www.youtube.com/results?search_query="+n));
            text.setText("done op website");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        long l =4000;
        try {
            Thread.sleep(l);
            text.setText("waited for 4 secs");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(x,y);
        text.setText("moved on the song");
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        text.setText("Clicked on song");
        try {
            Thread.sleep(1000);
            text.setText("waited for 1 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fingers.keyPress(KeyEvent.VK_SPACE);
        fingers.keyRelease(KeyEvent.VK_SPACE);
        text.setText("Paused the video");
        try {
            Thread.sleep(1000);
            text.setText("waited for 1 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*fingers.mouseMove(743, 143);
        text.setText("Moved towards url");
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        text.setText("pressed on url bar");*/
        int sasa=1;
        for(;sasa<= 13;sasa++){
            try {
                Thread.sleep(200);
                text.setText("waited fpr 4 sec");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fingers.keyPress(KeyEvent.VK_SHIFT);
            fingers.keyPress(KeyEvent.VK_TAB);
            fingers.keyRelease(KeyEvent.VK_TAB);
        }
        fingers.keyRelease(KeyEvent.VK_SHIFT);
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_C);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_C);
        text.setText("crtl c ed");
        //fingers.mousePress(InputEvent.BUTTON1_MASK);
        //fingers.mouseRelease(InputEvent.BUTTON1_MASK);

        try {
            desk.browse(URI.create("https://mp3offline.org/"));
            text.setText("opened mp3 website");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(4000);
            text.setText("waited fpr 4 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(x1,y1);

        text.setText("moved on the serach bar");
        try {
            Thread.sleep(1000);
            text.setText("waiting for 1 sec");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        text.setText("Pressed on the search bar");
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_V);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_V);
        text.setText("pasted url");
        try {
            Thread.sleep(1000);
            text.setText("waiting for 1 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_ENTER);
        fingers.keyRelease(KeyEvent.VK_ENTER);
        text.setText("pressed enetr");
        fingers.mouseMove(x2,y2);
        text.setText("moving mouse on download button");
        try {
            Thread.sleep(6000);
            text.setText("waiting for 4 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        text.setText("Pressed on download");
        try {
            Thread.sleep(8000);
            text.setText("waited for 5 sec");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_ENTER);
        fingers.keyRelease(KeyEvent.VK_ENTER);
        text.setText("confirmed download");
        fingers.keyPress(KeyEvent.VK_ALT);
        fingers.keyPress(KeyEvent.VK_TAB);
        fingers.keyRelease(KeyEvent.VK_ALT);
        fingers.keyRelease(KeyEvent.VK_TAB);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Main obj = new Main();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //text

         text.setFont(new Font(25));
        text.setX(50);
        text.setY(100);
        text.setText("Enter song name:");
        text.setFill(Color.rgb(0,255,51));

        //inp
        TextField sc = new TextField();
        sc.setStyle("-fx-background-color : #808080");
        sc.setFont(new Font(20));
        //inp for mosue
        TextField mousex = new TextField();
        mousex.setStyle("-fx-background-color : #808080");
        mousex.setFont(new Font(20));
        TextField mousey = new TextField();
        mousey.setStyle("-fx-background-color : #808080");
        mousey.setFont(new Font(20));
        TextField mouse1x = new TextField();
        mouse1x.setStyle("-fx-background-color : #808080");
        mouse1x.setFont(new Font(20));
        TextField mouse1y = new TextField();
        mouse1y.setStyle("-fx-background-color : #808080");
        mouse1y.setFont(new Font(20));
        TextField mouse2x = new TextField();
        mouse2x.setStyle("-fx-background-color : #808080");
        mouse2x.setFont(new Font(20));
        TextField mouse2y = new TextField();
        mouse2y.setStyle("-fx-background-color : #808080");
        mouse2y.setFont(new Font(20));
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
        v.getChildren().addAll(text,sc,click,texting,mousex,mousey,mouse1x,mouse1y,mouse2x,mouse2y);
        click.setOnAction(value ->  {
            text.setText("Please be patient");
            String mname =sc.getText();
            String mousevalx=mousex.getText();
            String mousevaly=mousey.getText();
            int int_mouse_val_x = Integer.parseInt(mousevalx);
            int int_mouse_val_y = Integer.parseInt(mousevaly);
            String mouseval1x=mouse1x.getText();
            String mouseval1y=mouse1y.getText();
            int int_mouse_val_1x = Integer.parseInt(mouseval1x);
            int int_mouse_val_1y = Integer.parseInt(mouseval1y);
            String mouseval2x=mouse2x.getText();
            String mouseval2y=mouse2y.getText();
            int int_mouse_val_2x = Integer.parseInt(mouseval2x);
            int int_mouse_val_2y = Integer.parseInt(mouseval2y);
            obj.downloading_sound(mname,int_mouse_val_x,int_mouse_val_y,int_mouse_val_1x,int_mouse_val_1y,int_mouse_val_2x,int_mouse_val_2y);
            text.setText("Done.");
        });

    }
    static void chck() {
        fingers.mouseMove(100,100);
    }

    public static void main(String[] args) {
        launch(args);

        //chck();
    }
}
