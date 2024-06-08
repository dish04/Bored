package sample;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class song_getter {
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
    song_getter(String n){
        name = n;
    }
    String[] names;
    boolean check(){
        if(Desktop.isDesktopSupported())
            return true;
        else
            return false;
    }

    void get_song_name(){
        System.out.println("Enter song name:");
        name = sc.nextLine();
        System.out.println(name);
    }

    void downloading_sound(){
        String n = name.replace(" ","+");
        try {
            desk.browse(URI.create("https://www.youtube.com/results?search_query="+n));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        long l =6000;
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
        fingers.mouseMove(343, 50);
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mouseMove(643,430);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.mousePress(InputEvent.BUTTON1_MASK);
        fingers.mouseRelease(InputEvent.BUTTON1_MASK);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_CONTROL);
        fingers.keyPress(KeyEvent.VK_V);
        fingers.keyRelease(KeyEvent.VK_CONTROL);
        fingers.keyRelease(KeyEvent.VK_V);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fingers.keyPress(KeyEvent.VK_ENTER);
        fingers.keyRelease(KeyEvent.VK_ENTER);
        fingers.mouseMove(580,400);
        try {
            Thread.sleep(2000);
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
    /*public static void main(String[] agrs){
        int m = 1;
        while (m!=0) {
            song_getter get = new song_getter();
            get.get_song_name();
            get.downloading_sound();
            //fingers.mouseMove(643,200);
        }
    }*/
}
