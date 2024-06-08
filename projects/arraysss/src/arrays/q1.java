package arrays;

import java.util.Scanner;
public class q1 {
    static int in;
    static int[] ar,car={0,0,0,0,0,0,0,0,0,0};
    q1() {
        ar = new int[this.count(this.input())];
    }
    int input() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        in =sc.nextInt();
        return in;
    }
    int count(int a) {
        int c=0;
        while(a!=0) {
            a=a/10;
            c++;
        }
        return c;
    }
    void arrange() {
        int ld,i=0,n = in;
        while(n!=0) {
            ld=n%10;
            ar[i]=ld;
            i++;
            n=n/10;
        }
    }
    void count() {
        for (int i =0 ;i<ar.length;i++){
            switch (ar[i]){
                case 0:{car[0]=car[0]+1;} break;
                case 1:{car[1]=car[1]+1;}break;
                case 2:{car[2]=car[2]+1;}break;
                case 3:{car[3]=car[3]+1;}break;
                case 4:{car[4]=car[4]+1;}break;
                case 5:{car[5]=car[5]+1;}break;
                case 6:{car[6]=car[6]+1;}break;
                case 7:{car[7]=car[7]+1;}break;
                case 8:{car[8]=car[8]+1;}break;
                case 9:{car[9]=car[9]+1;}break;
            }
        }
    }
    public static void main(String[] args) {
        q1 obj = new q1();
        obj.arrange();
        obj.count();
        System.out.print("0 x "+car[0]+"\n"+"1 x "+car[1]+"\n"+"2 x "+car[2]+"\n"+"3 x "+car[3]+"\n"+"4 x "+car[4]+"\n"+"5 x "+car[5]+"\n"+"6 x "+car[6]+"\n"+"7 x "+car[7]+"\n"+"8 x "+car[8]+"\n"+"9 x "+car[9]);
    }
}
