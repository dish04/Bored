package com.company;

import java.util.Scanner;


public class billing {
    public static void main(String agrs[]) {
        int a[] = new int[10];
        int sum_even=0, sum_odd=0,o=0,e=0;
        //int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //input
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + (i + 1) + " of array a");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(a[i]%2 == 0){
                sum_even += a[i];
                e++;
            }
            else{
                sum_odd += a[i];
                o++;
            }
        }
        System.out.println("The avg of even no. = "+(sum_even/e));
        System.out.println("The avg of odd no. = "+(sum_odd/o));
    }
}
/*
sum_even = sum of even
sum_odd = sum of odd
e =no of even no.
o = no pf odd no.
a = array
 */
