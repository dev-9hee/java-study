package basic;

import java.util.Scanner;

// 백준 : 별 찍기 - 1
public class Solution2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
