package aass.company;

public class triangle1 {
    static void pattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] agrs){
        pattern(5);
    }
}
