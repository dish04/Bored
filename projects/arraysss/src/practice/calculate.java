package practice;

import java.util.Scanner;

public class calculate {
    int num , f, rev;
    //calculate obj = new calculate(input());
    static int input()
    {
        int in;
        Scanner sc = new Scanner(System.in);
        in = sc.nextInt();
        return in;
    }
    calculate(int n)
    {
        num =n;
        f=0;
        rev=0;
    }
    int prime()
    {
    for(int i =1 ;i <=num;i++)
    {
        int c = num%i;
        if(c==0)
        {
            f++;
        }
    }
    if(f==2){
        return 1;
    }
    else
        {
        return 0;
    }

    }
    int reverse()
    {
        int n = num;
        while(n!=0)
        {
            int d =  n%10;
            rev = rev*10+d;
            n =n/10;
        }
        return rev;
    }
    void display()
    {
        if(f==2 && num==rev)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args)
    {
        calculate obj = new calculate(input());
        obj.prime();
        obj.reverse();
        obj.display();
    }
}