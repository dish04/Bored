package practice;

public class lkj {
    public static void main(String[] args){
        double k = 9.4;
        //System.out.print(Math.rint(k));
        outer:
        for(int a=1;a<90;a++){
            inner:
            System.out.println(a);
            for(int i=0;i<80;i++){

                if(i<k){
                System.out.println(i+"continuing");
                continue ;
                }

                System.out.print("im printing after continue");

                if(i>k){
                System.out.println(i+"breaking");
                break outer;
                }
            }
        }
    }
}

