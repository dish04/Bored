package practice;
import java.util.*;
public class Three {
    public static void main(String agrs[]){
        int a[]= {10,10,10,22,32,23,22,32,32,21};
        int b[]=null;
        int c=0;
        int n=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++) {
                if (a[i]==a[j]&&i!=j){
                    //System.out.println(a[i]+"=="+a[j]);
                    if(a[i]!=0) {
                        c++;
                    }
                    a[j]=0;
                }
            }
        }
        for(int s:a){
            System.out.print(s+" ");
        }
        b = new int[a.length-c];
        System.out.println();

        for (int k =0;k<a.length;k++) {
            if(a[k]!=0){
                b[n]=a[k];
                n++;
            }
        }

        for(int g:b){
            System.out.print(g+" ");
        }
    }
}
