package com.company;
import java.util.*;

public class watev {
    public static void main(String agrs[]){
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0;i<10;i++){
            System.out.println("Element "+(i+1)+" of array a");
            a[i] = sc.nextInt();
            System.out.println("Element "+(i+1)+" of array b");
            b[i] = sc.nextInt();
        }
        //check
        for(int i=0;i<10;i++){
            int c = a[i]%b[i];
            if(c==0){
                System.out.println(b[i]+"is the factor of"+a[i]);
            }
        }
    }
}
