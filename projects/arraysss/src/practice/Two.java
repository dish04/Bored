package practice;
import java.util.*;
public class Two {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        boolean f=false;
        int a[] = new int[10] ;
        //a = new int[]{10,10,10,29,3,434,34,93,34,34};
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for (int value : a) {
            if (value == 10) {
                sum = sum +value;
            }
        }
        if(sum==30){
            f = true;
        }
        for(int h :a){
         System.out.print(h+" ");
        }
        System.out.println(f);
    }
}
