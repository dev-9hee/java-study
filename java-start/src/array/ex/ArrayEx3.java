package array.ex;

import java.util.Scanner;

// 문제 - 배열과 역순 출력
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력 : ");
        for (int i=4; i>=0; i--) {
            System.out.print(nums[i]);
            if (i > 0) System.out.print(", ");
        }

        sc.close();
    }
}
