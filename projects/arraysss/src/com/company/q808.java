package com.company;

public class q808 {
    double volume(double a){
        //cube
        return a*a*a;
    }
    double volume(double r,double pi){
        return pi*Math.pow(r,3)*(4/3);
    }

    double volume(double l, double b,double h){
        return l*b*h;
    }
}
