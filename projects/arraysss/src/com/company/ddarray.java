package com.company;

import java.util.Scanner;

public class ddarray {
    static Scanner sc = new Scanner(System.in);
    static int[][] m = new int[4][4];
    static int[][] n = new int[4][4];
    static int[][] p = new int[4][4];
    static void input(int[][] k){
        for(int i=0;i<4;i++){
            for (int j =0;j<4;j++){
                System.out.println("Enter row "+i+" "+j+" element");
                k[i][j]=sc.nextInt();
            }
        }
    }
    static void add(){
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                    p[i][j]=m[i][j]+n[i][j];
            }
        }
    }
    static void display(){
        for(int i=0;i<4;i++){
            for (int j =0;j<4;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        input(m);
        input(n);
        add();
        display();
    }
}
