package project;

import java.util.Scanner;
public class q4 {
    static int input() {
        System.out.println("Enter number:");
        Scanner sc =  new Scanner(System.in);
        int g = sc.nextInt();
        return g;
    }
    public static void main(String[] args) {
        int x = input();
        int n1000 =0,n500=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
        if(x >= 1000)
            n1000=x/1000;

        if(x>=500)
            n500 = (x-(n1000*1000))/500;

        if(x>=100)
            n100 =(x-(n1000*1000)-(n500*500))/100;

        if(x>=50)
            n50 =(x-(n1000*1000)-(n500*500)-(n100*100))/50;

        if(x>=20)
            n20 =(x-(n1000*1000)-(n500*500)-(n100*100)-(n50*50))/20;

        if(x>=10)
            n10 =(x-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20))/10;

        if(x>=5)
            n5 =(x-(n1000*1000)-(n500*500)-(n100*100)-(n20*20)-(n50*50)-(n10*10))/5;

        if(x>=2)
            n2 =(x-(n1000*1000)-(n500*500)-(n100*100)-(n50*50)-(n20*20)-(n10*10)-(n5*5))/2;

        if(x>=1)
            n1 = (x - (n1000 * 1000) - (n500 * 500) - (n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5) - (n2 * 2));

        System.out.println(n1000+"x 1000\n"+n500+"x 500\n"+n100+"x 100\n"+n50+"x 50\n"+n20+"x 20\n"+n10+"x 10\n"+n5+"x 5\n"+n2+"x 2\n"+n1+"x 1");

}
}