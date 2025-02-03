package basic;

import java.util.Scanner;

// 백준 : 별 찍기 - 3
public class Solution2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
