package com.company;

import java.util.Scanner;

public class kyu {
    public static void main(String agrs[]) {
        int a[] = new int[10];
        //int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + (i + 1) + " of array a");
            a[i] = sc.nextInt();
        }
        //max and min
        int max = a[0],min=a[0];
        int i=0;
        for ( i = 0; i < 10; i++) {
            //updating max val
            if(a[i]<max){
            max = a[i];
            }
            //updating min val
            if(a[i]>min){
                min = a[i];
            }
        }
        System.out.println("Max = "+max+" position"+(i+1)+" Min = "+min);

    }
}