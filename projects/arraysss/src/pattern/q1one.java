package pattern;

import java.util.Scanner;
public class q1one {
    static int n,type;
    static Scanner sc = new Scanner(System.in);
    q1one()
    {
        n = this.input();
    }
    int input() {
        System.out.println("Enter limit:");
        int x =sc.nextInt();
        return x;
    }
    void pattern() {
        for(int i=1;i<=n;i++) {
            for (int j=n;j>=i;j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    void fibbo(){
        int one,two,add;
        for (int i=1;i<=n;i++) {
            one =0;two=1;
            for (int j=1;j<=i;j++) {
                add=one+two;
                System.out.print(add+" ");
                two=one;
                one =add;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        q1one obj = new q1one();
        System.out.println("Enter 1 for pattern 2 for fibbonacci series:");
        type = sc.nextInt();
        switch (type) {
            case 1: obj.pattern(); break;
            case 2 :obj.fibbo(); break;
        }
    }
}
