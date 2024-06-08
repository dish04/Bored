package practice;

import java.util.Scanner;

public class BookFair {
    String BName;
    double price;
    BookFair(){
        BName="";
        price=0;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        BName =sc.next();
        System.out.println("Enter price:");
        price=sc.nextInt();
    }
    void calculate() {
        double discount = 0;
        if (price<=1000) {
            discount=0.02;
        }
        if (price>1000&&price<=3000) {
            discount=0.1;
        }
        if (price>3000) {
            discount=0.15;
        }
        price-=price*discount;
    }
    void display(){
        System.out.println("Your book "+BName+" costs "+price+" after discount.");
    }
    public static void main(String[] args) {
        BookFair obj = new BookFair();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
