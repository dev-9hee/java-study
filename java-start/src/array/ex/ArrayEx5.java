package array.ex;

import java.util.Scanner;

// 문제 - 합계와 평균2
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = sc.nextInt();

        int[] nums = new int[count];
        int sum = 0; // 합계
        double avg; // 평균

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        avg = (double) sum / count;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);

        sc.close();
    }
}
