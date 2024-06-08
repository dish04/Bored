package com.company;

import java.util.Scanner;

public class q409 {
    static Scanner sc = new Scanner(System.in);
    static String cse;
    double dl,dp,amtl,amtpc;
    double disc(double a){
        if(a<25000){
            dl=0;
            dp=0.05;

        }
        if(a>25000&&a<=57000){
            dl=0.05;
            dp=0.075;

        }
        if(a>57000&&a<100000){
            dl=0.075;
            dp=0.1;

        }
        else{
            dl=0.1;
            dp=0.15;
        }
        amtl=a*(1-dl);
        amtpc=a*(1-dp);
        if(cse.equals("laptop"))
            return amtl;
        else
            return amtpc;

    }

    public static void main(String[] args) {
        System.out.println("Enter amt");
        double a=sc.nextInt();
        System.out.println("enter the case");
        cse = sc.next();
        q409 obj = new q409();
        System.out.println(obj.disc(a));
    }
}
