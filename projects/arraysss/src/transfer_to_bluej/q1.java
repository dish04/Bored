import java.util.Scanner;

public class q1 {
    int count(int a)
    {
        int c=0;
        while(a!=0)
        {
            a=a/10;
            c++;
        }
        return c;
    }
    boolean chck(int a)
    {
        int m=a;
        int num = 0;
        int pwr =this.count(a);;
        while (m>0) {
           int n = m%10;
           num = (int) (num+(Math.pow(n,pwr)));
           m= m/10;
           pwr--;
        }
        return num == a;
    }
    static int input()
    {
        Scanner sc =  new Scanner(System.in);
        int g = sc.nextInt();
        return g;
    }
    public static void main(String[] args)
    {
        q1 obj = new q1();
        if(obj.chck(input())){
            System.out.println("Yes it ia a disarium number.");
        }
        else
        {
            System.out.println("No it is not a disarium number.");
        }
    }
}
