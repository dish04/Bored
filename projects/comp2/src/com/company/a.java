package com.company;

import java.util.Scanner;

public class a {

    public static String inp() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        return s;
    }

    static int index(String s) {

        return s.indexOf(" ");

    }

    static int lindex(String s) {

        return s.lastIndexOf(" ");

    }

    void first_word(String s) {

        String s1 = s.substring(0,index(s));
        System.out.println(s1);


    }

    void last_word(String s) {

        String s1 = s.substring(lindex(s), s.length());
        System.out.println(s1);

    }

    public static void main(String[] args) {
        a obj = new a();
        obj.first_word(inp());
        obj.last_word(inp());
    }
}
