package pattern;

import java.util.Scanner;
public class q2e {
    int n;
    q2e()
    {
        n = this.input();
    }
    int input() {
        System.out.println("Enter limit:");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        return x;
    }
    void pattern() {
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                if(j%2==0)
                    System.out.print("0"+" ");
                else
                    System.out.print("1"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        q2e obj = new q2e();
        obj.pattern();
    }
}
