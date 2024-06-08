package proj2;
import java.util.Scanner;
public class GoCab {
    static String cabReg, cabtype;static int km, amount;
    GoCab(String s, int a) {
        cabReg = s;
        km = a;
    }
    void calculate(String type) {
        switch (type) {
            case "Sedan":
                if (km > 4)
                    amount = (100) + (km - 4) * 17;
                else
                    amount=100;break;
            case "SUV":
                if (km > 4)
                    amount = (150) + (km - 4) * 22;
                else
                    amount=150;break;
        }
    }
    void display() {
        System.out.println("Go Cab Services Ltd."+"\nCab Number       : "+cabReg+"\nTotal Kilometers : "+km+"\nTotal Fare       : "+amount);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Registration Number:");
        String s = sc.next();
        System.out.println("Enter Kilometers:");
        int a = sc.nextInt();
        System.out.println("Enter Cab Type:");
        cabtype =sc.next();
        GoCab obj = new GoCab(s,a);
        obj.calculate(cabtype);
        obj.display();
    }
}