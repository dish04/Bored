import java.util.Scanner;

public class p2 {
    Scanner sc = new Scanner(System.in);
    int n;
    void accept(){
        System.out.println("Enter number:");
        n=sc.nextInt();
    }
    boolean harshad() {
        int ln, sum = 0, dn = n;
        while (n != 0) {
            ln = n % 10;
            sum += ln;
            n /= 10;
        }
        return dn % sum == 0;
    }

    boolean perfect() {
        int divsum = 0, dn = n;
        for (int i = 1; i <= n; i++) {
            if (dn % i == 0) {
                divsum += i;
            }
        }
        return (divsum-n) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p2 obj = new p2();
        obj.accept();
        System.out.println("Enter 1 for harshad number and 2 for perfect number:");
        String choice = sc.next();
        switch (choice){
            case "1":
                if(obj.harshad()){
                    System.out.println("Yes it is a Harshad number");
                }
                else {
                    System.out.println("No it is not a Harshad number");
                }
                break;
            case "2":
                if(obj.perfect()){
                    System.out.println("Yes it is a Perfect number");
                }
                else {
                    System.out.println("No it is not a Perfect number");
                }
                break;
        }
    }
}

