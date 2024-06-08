package aass.company;

import java.util.Scanner;

public class floyd {
    int newn;
    char a ='A';

    void input(){
        for(int i=0;i<2;i++) {
            Scanner sc = new Scanner(System.in);
            newn = sc.nextInt();
        }
    }
    void pattern(){
        int goer=1,j=1;
        for(int i=1;i<=newn;i++){
            for(int k=newn;k>=i;k--){
                System.out.print(i);
                goer++;
            }

            for(j=1;j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
            a++;
        }
    }


    public static void main(String args[]){
        floyd pattern =new floyd();
        pattern.input();
        pattern.pattern();
    }
}
