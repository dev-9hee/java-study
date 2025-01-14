package cond.ex;

// 더 큰 숫자 찾기 문제
public class CondOpEx {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
