package basic;

import java.util.Scanner;

// 백준 : 별 찍기 - 5
public class Solution2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) { // 앞 공백 4, 3, 2, 1, 0 => n-i
                System.out.print(" ");

            }
            for (int j=1; j<=2*i-1; j++) { // 별 1, 3, 5, 7, 9 => 2i-1
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
