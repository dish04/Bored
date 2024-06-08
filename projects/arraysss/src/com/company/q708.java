package com.company;

import java.util.Scanner;

public class q708 {
    int rev(int n){
        int revd=0;
        while(n!=0){
            int ld=n%10;
            n=n/10;
            revd=revd*10+ld;
        }
        return revd;
    }
    boolean palindrome(int n){

        if(this.rev(n)==n){
            return true;
        }
        else {
            return false;
        }
    }

    boolean perfect_number(int n){
        int sum=0,t=n;
        while(n!=0){
            int ld = n%10;
            sum+=ld;
            n/=10;
        }
        if(sum==t){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        q708 obj = new q708();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = sc.nextInt();
        System.out.println("enter 1 for plaindrome");
        System.out.println("enter 2 for perfect");
        int c=sc.nextInt();
        switch (c){
            case 1:
                if(obj.palindrome(n))
                    System.out.println("palindrome");
                else
                    System.out.println("no");
                break;

            case 2:
                if(obj.perfect_number(n))
                    System.out.println("perfect");
                else
                    System.out.println("no");
                break;

            default:
                System.out.println("enter proper case");
        }
    }
}
