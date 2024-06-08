package com.company;

import java.util.Scanner;

public class fact {
    static int number;
    Scanner sc=new Scanner(System.in);
    void input(){
        number = sc.nextInt();
    }
    static int facto(int n){
        if (n==0){
            return 1;
        }
        else {
            return n*facto(n - 1);
        }
    }

    public static void main(String[] args) {
    fact obj = new fact();
    obj.input();
    System.out.print(facto(number));
    }
}
