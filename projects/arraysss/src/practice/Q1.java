package practice;

import java.util.Scanner;

public class Q1 {

    double area;

    double area(double q, double w, double e)
    {
        double s;
        s= (q+w+e)/2;
        area=s*(s-q)*(s-w)*(s-e);
        return area;
    }
    double area(int l,int m,int n)
    {

        area=0.5*n*(m+l);
        return area;
    }
    double area(double d1, double d2)
    {

        area =0.5*d1*d2;
        return area;
    }
    double input()
    {
        double val;
        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        val = sc.nextDouble();
        return val;
    }

    public static void main(String[] args)
    {
        Q1 in = new Q1();
        System.out.println(in.area(in.input(),in.input()));
        System.out.println(in.area(in.input(),in.input(),in.input()));
        System.out.println(in.area((int)in.input(),(int)in.input(),(int)in.input()));
    }
}
