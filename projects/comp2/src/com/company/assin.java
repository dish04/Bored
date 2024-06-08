package com.company;

import java.util.Scanner;

public class assin {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Text");
        String s = sc.next();
        System.out.println("c");
        int c = sc.nextInt();
        System.out.println("n");
        int n = sc.nextInt();
        word(c,n,s);
    }

    static void word(int c, int n, String s){
        String word, test="j s";
        word = s.substring(n,n+c);
        System.out.println(word);
        System.out.println(test.indexOf(" "));

    }
}