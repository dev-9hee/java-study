package array.ex;

import java.util.Scanner;

// 문제 - 2차원 배열2
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요 : ");
        int count = sc.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[count][subjects.length];

        for(int i=0; i<count; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for(int j=0; j<subjects.length; j++){
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<count; i++){
            int total = 0;
            for(int j=0; j<subjects.length; j++){
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " +
                    average);
        }

        sc.close();
    }
}
