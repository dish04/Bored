package com.company;

public class tab {
    static void pattern(int n){
        int h=1;
        for(int i =0;i<=n;i++){
            for (int j=n;j>=i;j--) {
                System.out.print(" ");
            }
            for (int k=0 ;k<=i;k++) {
                System.out.print(h+" ");
                h++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        pattern(5);
        //System.out.println("\t kmknlbjgk"+"ojyfkjhkk \t"+"gjfy");
    }
}
