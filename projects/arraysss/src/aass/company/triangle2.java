package aass.company;

public class triangle2 {
    void pattern(int n){
        for(int i =n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        triangle2 obj = new triangle2();
        obj.pattern(6);
    }
}
