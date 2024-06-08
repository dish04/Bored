package proj2;
import java.util.Scanner;
class HiArm {
    static int n;
    HiArm() {
        n=0;
    }
    HiArm(int a){
        n=a;
    }
    int sumArm(int a) {
        int ld = 0;
        int sum=0;
        while(a!=0) {
            ld = a%10;
            sum=sum+(ld*ld*ld);
            a=a/10;
        }
        return sum;
    }
    void isArm() {
        if(this.sumArm(n)==n)
            System.out.println("Yes it is an Armstrong Number");
        else
            System.out.println("No it is not an Armstrong Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        HiArm obj = new HiArm(n);
        obj.isArm();
    }
}