package com.company;

public class charanstribo {
    static int o,t,th,s,a=0,b=0,c=1,d=1;
    static void pattern(int n){
        for (int i=0;i<n;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        pattern(8);
    }
}
