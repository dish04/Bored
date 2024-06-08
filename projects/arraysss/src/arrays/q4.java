package arrays;

import java.util.Scanner;
public class q4 {
    static int[] in=new int[20];
    Scanner sc = new Scanner(System.in);
    q4() {
        for (int i=0;i<in.length;i++) {
            System.out.println("Enter no "+(i+1));
            in[i] = sc.nextInt();
        }
    }
    void arrange_acs(){
        int t;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < (10 - i); j++) {
                if (in[j - 1] > in[j]) {
                    t = in[j - 1];
                    in[j - 1] = in[j];
                    in[j] = t;
                }

            }
        }
    }
    void arrange_des() {
        int t;
        for (int i = 10; i < in.length; i++) {
            for (int j = 11; j < (in.length - i); j++) {
                if (in[j - 1] > in[j]) {
                    t = in[j - 1];
                    in[j - 1] = in[j];
                    in[j] = t;
                }
            }
        }
    }
    public static void main(String[] args){
        q4 obj = new q4();
        obj.arrange_acs();
        obj.arrange_des();
        for(int i=0;i<in.length;i++){
            System.out.print(in[i]+" ");
        }
    }
}