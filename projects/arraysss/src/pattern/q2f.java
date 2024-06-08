package pattern;

import java.util.Scanner;
public class q2f {
    int n;
    q2f() {
        n = this.input();
    }
    int input() {
        System.out.println("Enter limit:");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        return x;
    }
    void pattern() {
        int y=1;
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(y+" ");
                y++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        q2f obj = new q2f();
        obj.pattern();
    }
}
