package com.company;

class fiboprttwo {
    static int o,t,th,s,a=-1,b=-0,c=0,d=1;
    static void pattern(int n){
        for (int i=0;i<n;i++){
            o=b-a;
            t=c-b;
            s=o+t;
            a=b;b=c;c+=s;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
       // pattern(7);
       System.out.println(Integer.valueOf("032"));
    }
}
