package basic;

import java.util.Scanner;

// 백준 : 별 찍기 - 2
public class Solution2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
