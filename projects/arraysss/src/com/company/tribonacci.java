package com.company;

public class tribonacci {
    static int o,t,th,s,a=0,b=0,c=1,d=1;
    static void pattern(int n){
        for (int i=0;i<n;i++){
            o=b-a;
            t=c-b;
            th=d-c;
            s=o+t+th;
            a=b;b=c;c=d;d+=s;
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        pattern(7);
    }
}
