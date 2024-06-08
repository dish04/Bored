package pattern;

import java.util.Scanner;
public class q2b {
    int n;
    q2b()
    {
        n = this.input();
    }
    int input()
    {
        System.out.println("Enter limit:");
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        return x;
    }
    void pattern()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(" ");
            for (int j=n;j>=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        q2b obj= new q2b();
        obj.pattern();
    }
}
