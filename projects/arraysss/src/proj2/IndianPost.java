package proj2;
import java.util.Scanner;
public class IndianPost {
    int w;static int charge_same,charge_diff;static String t;
    IndianPost() {
        w=0;
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight:");
        w =sc.nextInt();
        System.out.println("Enter l for local ans s for interstate");
        t=sc.next();
    }
    void calToPay() {
        if(w<=500) {
            charge_same=30;
            charge_diff=50;
        }
        if(w>500&&w<=5000) {
            int d = (w-500)/500;
            charge_same =d*8+30;
            charge_diff = d*14+50;
        }
        if(w>5000) {
            int d = ((w-5500))/500;
            charge_same=(d*10)+(5000*8)+30;
            charge_diff=(d*16)+(5000*14)+50;
        }
    }
    public static void main(String[] args) {
        IndianPost obj = new IndianPost();
        obj.accept();
        obj.calToPay();
        switch (t) {
            case "l":{System.out.println("Amount = " + charge_same);}break;
            case "s":{System.out.println("Amount = " + charge_diff);}break;
        }
    }
}
