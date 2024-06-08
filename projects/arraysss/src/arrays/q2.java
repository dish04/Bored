package arrays;
import java.util.Scanner;
public class q2 {
    static int[] in=new int[10];
    Scanner sc = new Scanner(System.in);
    q2() {
        for (int i=0;i<in.length;i++) {
            System.out.println("Enter no "+(i+1));
            in[i] = sc.nextInt();
        }
    }
    void arrange() {
        int t;
        for (int i = 0; i < in.length; i++) {
            for (int j = 1; j < (in.length - i); j++) {
                if (in[j - 1] < in[j]) {
                    t = in[j - 1];
                    in[j - 1] = in[j];
                    in[j] = t;
                }
            }
        }
    }
    void print_biggest_odd_no() {
        this.arrange();
        for (int i =0;i<in.length;i++){
            if (in[i]%2!=0){
                System.out.println("Largest number:"+in[i]);
                break;
            }
        }
    }
    public static void main(String[] args){
        q2 obj = new q2();
        obj.print_biggest_odd_no();
    }
}