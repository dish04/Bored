package com.company;

import java.util.*;

public class Main {

    Main a_one = new Main();
    String s = a_one.inp();

    public String inp() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        return s;
    }

    int index() {

        return s.indexOf(" ");

    }

    int lindex() {

        return s.lastIndexOf(" ");

    }

    void first_word() {

        System.out.println(s.substring(0, a_one.index()));

    }

    void last_word() {

        System.out.println(s.substring(a_one.lindex(), s.length()));

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.first_word();
        obj.last_word();
    }
}
