package aass.company;

import java.util.Scanner;

public class charan {
    public static void main(String args[]) {

        int c = 0, n, k = 0, h = 0, i, j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = n; i > 0; i++) {
            for (j = i; j > 0; j++) {
                System.out.print(" ");
            }

            for (c = 1; c < i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}