package project;

import java.util.Scanner;
public class q5 {
    static int a,conv;
    static String converter(int a,int space) {
        int rem;
        String num="";
        String[] remi = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while(a>0) {
            rem = a%space;
            num=remi[rem]+num;
            a=a/space;
        }
        return num;
    }
    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        a =sc.nextInt();
        System.out.println("Enter case:");
        conv =sc.nextInt();
    }
    public static void main(String[] args) {
        input();
        switch (conv){
            case 1:
                System.out.println(converter(a,16));
                break;
            case 2:
                System.out.println(converter(a,8));
                break;
            case 3:
                System.out.println(converter(a,2));
                break;
            default:
                System.out.println("Enter from 1 to 3");
        }
    }
}
