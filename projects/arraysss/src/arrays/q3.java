package arrays;

import java.util.Scanner;

public class q3 {
    static int[] in=new int[10],c_in=new int[10];
    Scanner sc = new Scanner(System.in);
    q3() {
        for (int i=0;i<in.length;i++) {
            System.out.println("Enter no "+(i+1));
            in[i] = sc.nextInt();
        }
    }
    void print(){
        c_in=in;
        System.out.println();
        for (int i=0;i<c_in.length;i++){
            if(c_in[i]%2==0){
                System.out.print(c_in[i]+" ");
            }
        }
        for (int i=0;i<c_in.length;i++){
            if(c_in[i]%2!=0){
                System.out.print(c_in[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        q3 obj = new q3();
        obj.print();
    }
}
