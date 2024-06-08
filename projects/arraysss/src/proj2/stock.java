package proj2;

import java.util.Scanner;

public class stock {
    static String nm="";
    static int qty=0,rate=0;
    static double amt=0,disc=0;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        nm =sc.next();
        System.out.println("Enter quantity:");
        qty=sc.nextInt();
        System.out.println("Enter rate:");
        rate=sc.nextInt();
    }
    void calculate() {
        amt=qty*rate;
        if(qty<=100)
            disc=0.05;
        if(qty>100&&qty<=200)
            disc=0.1;
        if(qty>200)
            disc=0.15;
        amt=amt-(amt*disc);
    }
    void display() {
        System.out.println("Name : "+nm+"\n"+"Quantity : "+qty+"\n"+"Rate : "+rate+"\n"+"Amount : "+amt);
    }
    public static void main(String[] args) {
        stock obj = new stock();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
