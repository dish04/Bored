import java.util.Scanner;

public class Electricbill{
    Scanner sc = new Scanner(System.in);
    String n;
    int units;
    int bill;
    void accept(){
        System.out.println("Enter name:");
        n=sc.next();
        System.out.println("Enter units consumed");
        units=sc.nextInt();
    }
    void calculate(){
        if(units<=100){
            bill=units*2;
        }
        if(units>100&&units<=200){
            bill=units*3;
        }
        if(units>=300){
            bill=units*5;
            bill+=0.025*bill;
        }
    }
    void print(){
        System.out.println(  "Name of the customer............................"+n+"Number of units consumed......................"+units+"Bill amount........................................."+bill);
    }
    public static void main(String[] args) {
        Electricbill obj = new Electricbill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
