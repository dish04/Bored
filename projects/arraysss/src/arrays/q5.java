package arrays;

import java.util.Scanner;
public class q5 {
    static int[] in=new int[50];static int n,num;
    Scanner sc = new Scanner(System.in);
    q5() {
        for (int i=0;i<in.length;i++) {
            System.out.println("Enter number "+(i+1)+":");
            in[i] = sc.nextInt();
        }
        System.out.println("Enter number to count:");
        n = sc.nextInt();
        num=0;
    }
    void find_count(){
        for (int i=0;i<in.length;i++) {
            if (in[i]==n){
                num++;
            }
        }
        System.out.println("Number of times the number "+n+" is repeating: "+num);
    }
    public static void main(String[] args){
        q5 obj = new q5();
        obj.find_count();
    }
}