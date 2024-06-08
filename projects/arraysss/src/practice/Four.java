package practice;

public class Four {
    public static void main(String args[]){
        int a[]=  {2,23,1,344,3,553,5,4,555,10,11,12,13,14,15,16};
        int b[]=null;
        int t=0;
        int h=0;
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a.length;j++) {
                if (a[i] - a[j] == -1) {
                    t++;
                    //System.out.println(t);
                }
            }
        }
        b = new int[t];
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a.length;j++) {
                if (a[i] - a[j] == -1) {

                }
            }
        }
        System.out.println(t+1);
    }
}
