package practice;

import java.util.Scanner;

public class obj {
    public void display(String g){
        System.out.println(g);
    }
   public void display(int j){
        System.out.println(j);
    }
    public void input(int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        sc.nextInt();
    }
    public static void main(String[] args){
        String f = "ffffff";
        obj obj = new obj();
        obj.display(f);
        int h =8;
        obj.display(h);
        obj.display(h);
    }
}
