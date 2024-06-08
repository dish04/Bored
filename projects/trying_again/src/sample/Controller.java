package sample;

import java.awt.*;

public class Controller {
    static Robot fingers;
    static {
        try {
            fingers = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

//        fingers.mouseMove(100,100);
        int n =1;
        while(true){
            Point p = MouseInfo.getPointerInfo().getLocation();
            int x = p.x;
            int y = p.y;

            System.out.println(x + "," + y);

        }
    }
}
