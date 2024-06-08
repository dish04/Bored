package project;

import java.util.Scanner;
public class q2 {
    static boolean prime(int a) {
            int flag=0;
            for(int i=1;i<a;i++) {
                if(a%i==0)
                flag++;
            }
            if(flag==1)
                return true;
            else
                return false;
    }
    static int rev(int a){
        int num= 0;
        while(a!=0) {
            num =num*10+(a%10);
            a= a/10;

        }
        return num;
    }
    static boolean adam(int a) {
    if(Math.pow(a,2)==rev((int)Math.pow(rev(a),2)))
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

        int a = input();
        if (prime(a)&&adam(a))
            System.out.println("It is a Prime-Adam number");
        else
            System.out.println("No it is not a Prime-Adam number");
    }
}