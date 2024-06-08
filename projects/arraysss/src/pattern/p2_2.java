package pattern;

import java.util.Scanner;
public class p2_2 {
    int n;
    p2_2() { n = this.input(); }
    int input() {
        System.out.println("Enter limit:");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        return x;
    }
    void pattern() {
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for (int j=i;j<=n;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p2_2 obj = new p2_2();
        obj.pattern();
    }
}
