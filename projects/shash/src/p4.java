public class p4 {
    int Sum(int a,int b){
        int sum=0;
        if(a%2==0){
            for(;a<=b;a+=2){
            sum+=a;
            }
        return sum;
        }
        else {
            for(a++;a<=b;a+=2){
                sum+=a;
            }
            return sum;
        }
    }
    double Sum(double N){
        double sum=1;
        for(double i=1.0;i<=N;i+=0.2){
            sum *=i;
        }
        return sum;
    }
    int Sum(int N){
        int ln, sum = 0, dn =N;
        while (N != 0) {
            ln = N % 10;
            if(ln%2!=0){
                sum+=ln;
            }
            N /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        p4 obj = new p4();
        obj.Sum(2.4);
        obj.Sum(78);
        obj.Sum(13,67);
    }
}