package proj2;

import java.util.Scanner;
public class Atransport {
    String name;int w;int charge;
    void charge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter weight");
        w = sc.nextInt();
    }
    void calculate() {
        if (w<=10)
        {charge=w*25;}
        if (w>10&&w<=30)
        {charge=(10*25)+((w-10)*20);}
        if (w>30)
        {charge=(10*25)+(20*20)+((w-30)*10);}
        charge = charge+(charge*5/100);
    }
    void print() {
        System.out.println("Name\tWeight\tBill Amount");
        System.out.println("----\t------\t-----------\n"+name+"\t"+w+"\t"+charge);
    }
    public static void main(String[] args) {
        Atransport obj = new Atransport();
        obj.charge();
        obj.calculate();
        obj.print();
    }
}