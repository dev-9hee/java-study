package array.ex;

import java.util.Scanner;

// 문제 - 가장 작은 수, 큰 수 찾기
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        int[] nums = new int[count];
        int min = Integer.MAX_VALUE; // 가장 작은 정수
        int max = Integer.MIN_VALUE; // 가장 큰 정수

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();

            // 가장 작은 정수 찾기
            if (nums[i] < min) {
                min = nums[i];
            }

            // 가장 큰 정수 찾기
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

        sc.close();
    }
}
