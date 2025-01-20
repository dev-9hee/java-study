package array.ex;

import java.util.Scanner;

// 문제 - 배열의 입력과 출력
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("출력");

        for (int num : nums) {
            System.out.print(num);
            if (num != 5) System.out.print(", ");
        }

        sc.close();
    }
}
