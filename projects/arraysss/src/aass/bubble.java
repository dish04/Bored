 

import java.util.Scanner;

public class bubble {
    int newn;
    Scanner sc = new Scanner(System.in);
    int[] s2 = new int[newn];
    bubble(int n){
        newn =n;
    }
    public void input(){

        for (int i=0;i<s2.length;i++){
            System.out.print("lol");
            s2[i]=sc.nextInt();
        }
        //System.out.print("lol");
    }

    public void bubble_sort(){
        //for arranging in ascending order
        int t=0;
        for(int i = 0; i<=s2.length-1; i++)
        {
            for(int j=0;j<s2.length-1;j++)
            {
                if (s2[j] >= s2[j + 1])
                {
                t = s2[j];
                s2[j]=s2[j+1];
                s2[j+1]=t;
                }
            }

        }
        for(int i =0;i<=s2.length-1;i++)
        System.out.print(s2[i]);

        //System.out.println(s[1]);
    }

    public static void main(String[] args) {
        bubble b = new bubble(8);
        b.input();
        b.bubble_sort();
    }
}
