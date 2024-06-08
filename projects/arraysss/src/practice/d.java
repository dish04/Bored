package practice;

public class d {
    public static void main(String args[]) {
         int a[]=  {0,2,4,1,3};

         for(int i=0;i<a.length;i++)
             System.out.println(a[i]=a[a[i]+3%a.length]);
             //a[i]);


         //int b[]=null;
        /*int a[] = new int[0];
        System.out.println(a.length);*/

    }
}