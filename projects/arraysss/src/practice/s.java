package practice;

public class s {
    public static void main(String[] args) {
        int n =28;
        int divsum = 0, dn = n;
        for (int i = 1; i <= n; i++) {
            if (dn % i == 0) {
                divsum += i;

            }
        }
        System.out.println(divsum-n);
    }
}
