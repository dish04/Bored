package com.company;

import java.util.Scanner;

public class q908 {
    void a(){
        int sum=0;
        for(int i =2;i<=18;i+=4){
            sum+=i+(-1*(i+2));
            System.out.println(i+" + "+(-1*(i+2))+sum);

        }
        System.out.println(sum);
    }

    void b(double x){
        double sum=0;
        for(int i=2;i<=20;i+=3){
            System.out.print(x/i+" + ");
            sum+=x/i;
        }
        System.out.println();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        q908 obj = new q908();
        Scanner sc = new Scanner(System.in);
        obj.a();
        System.out.println("enter number fir b");
        double b= sc.nextDouble();
        obj.b(b);
    }
}
