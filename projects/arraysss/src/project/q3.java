package project;

import java.util.Scanner;
public class q3 {
    static boolean count(int a) {
        int c=0;
        while(a!=0) {
            a=a/10;
            c++;
        }
        if(c==3)
            return true;
        else
            return false;
    }
    static boolean fascinating(int a) {
        int conc = a*1000000+a*2*1000+a*3;
        int nine =0;
        int l[] =new int[9];
        for(int i =0;i<9;i++) {
            int b = conc%10;
            l[i]=b;
            conc=conc/10;
        }
        int temp =0;
        for(int i=0; i < l.length; i++){
            for(int j=1; j < (l.length-i); j++){
                if(l[j-1] > l[j]){
                    temp = l[j-1];
                    l[j-1] = l[j];
                    l[j] = temp;
                }
            }
        }

        for(int i=0;i<8;i++) {
            if(l[i]==i+1) {
                nine++;
            }
        }
        if(nine==8)
            return true;
        else
            return false;
    }
    static int input() {
        System.out.println("Enter number:");
        Scanner sc =  new Scanner(System.in);
        int g = sc.nextInt();
        return g;
    }
    public static void main(String[] args) {
        int in = input();
        if(fascinating(in)&&count(in))
            System.out.println("It is a Fascinating number");
        else
        System.out.println("No it is not a Fascinating number");
    }
}