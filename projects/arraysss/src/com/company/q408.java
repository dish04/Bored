package com.company;

import java.util.Scanner;

public class q408 {
    int pan;
    String name;
    double taxincome, tax;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter name:");
        name=sc.next();
        System.out.print("Enter pan number");
        pan=sc.nextInt();
        System.out.print("Enter taxable income");
        taxincome=sc.nextInt();
    }
    void caclc(){



        if(taxincome<100000){
            tax=0;
        }
        if(taxincome>100000&&taxincome<=150000){
            tax = (taxincome-100000)*0.01;
        }
        if(taxincome>150000&&taxincome<=250000){
            tax=(taxincome-150000)*0.2+5000;
        }
        if(taxincome>250000){
            tax=(taxincome-250000)*0.3;
        }

    }
    void display(){
        System.out.print("Name\tPan number\ttaxincome\ttax\n"+name+"\t"+pan+"\t"+taxincome+"\t"+tax);
    }

    public static void main(String[] args) {
        q408 obj = new q408();
        obj.input();
        obj.caclc();
        obj.display();
    }

}
