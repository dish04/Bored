package com.company;

import java.util.Scanner;

public class ko {
    public static void main(String agrs[]) {
        int a[] = new int[10];
        //int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + (i + 1) + " of array a");
            a[i] = sc.nextInt();
        }
        for (int n = 0; n < 10; n++) {
            if (a[n] % 7 == 0 && a[n] % 10 == 7) {
                System.out.println("The " + (n + 1) + "element of the array is a buzz number");
            }
        }
    }
}