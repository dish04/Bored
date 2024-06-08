package practice;
import java.util.*;
public class One {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=10;
        int a[] = {12,12,32,11,23,123,21,32,332,3};

        for(int i=0;i<9;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    int d = 0, p = 0,q=0;
                    d = a[j];
                    //q=a[l+1];
                    for(int o=i;o<9;o++) {
                        a[o] = a[o + 1];
                        a[o + 1] = 0;

                    }
                    size -= 1;
                }
            }
        }

        for(int h:a){
            System.out.print(h+" ");
        }
    }
}
