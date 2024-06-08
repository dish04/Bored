package practice;

public class fact {

    public void display(int g){
        System.out.println(g);
    }

    public static String printingstring(String k, String l){
        return k+l;
    }

    public static int[] op(int[] a){
        for(int i =0; i<a.length;i++){
            a[i]= a[i]+1;
        }
        return a;
    }

    public static int facto(int a){
        if(a==0){
          return(1);
        }
        else {
            return (a * facto(a - 1));
        }
    }

    public static void main(String[] args){
        int a = 4;

        int[] b ={1,2,3,4,5,6,7,8,9,0};

        fact obj = new fact();
        obj obj2 = new obj();
        obj.display(facto(a));
        obj.display(a);
        String k ="poke", l = "mane";


        obj2.display(printingstring(k,l));
        op(b);
        for(int i =0;i<b.length;i++){
        System.out.println(b[i]);
    }
    }


}
