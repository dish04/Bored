package com.company;

public class tri {
    static void flyod(int n){
        char h=65;
        int k;
        for(int i=1;i<n;i++){
            for (k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=k;j>0;j--){
                System.out.print(" "+h+++" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        flyod(8);
    }
}
