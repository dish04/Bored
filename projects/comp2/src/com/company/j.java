package com.company;

import java.util.Scanner;

public class j {
    public static void main(String agrs[]) {
        int a[] = new int[10];

        //int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + (i + 1) + " of array a");
            a[i] = sc.nextInt();
        }
        //int k=10;
        //int b[] = new int[10];
        boolean zero_flag=true;
        int b[] = new int[]{0,1,2,3,4,5,6,7,8,9};
        //int c[] = new int[10];
        int c[] = new int[]{0,1,2,3,4,5,6,7,8,9};

        for(int i =0;i<10;i++){
            for (int j =0;j<10;j++){
                if (b[i]==a[j]){
                    if(i==0&&j==0){
                    zero_flag = false;
                    }
                    else {
                        c[i] = 0;
                    }
                }

            }
        }

        if(zero_flag){
            System.out.println(0);
        }


        for( int i =0;i<10;i++){
                if(c[i]!=0) {
                    System.out.println(c[i]);
                }
        }

    }
}