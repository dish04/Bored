package com.company;

import java.util.Scanner;

public class q509 {
    static Scanner sc = new Scanner(System.in);
    void patternone(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void pattertwo(int n){
        for(int i=n;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        q509 obj=new q509();
        System.out.println("Enter case 1 or 2");
        int c =sc.nextInt();
        System.out.println("Enter limit");
        int n = sc.nextInt();
        switch (c) {
            case 1 -> obj.patternone(n);
            case 2 -> obj.pattertwo(n);
            default -> System.out.println("Enter case");
        }
    }
}
