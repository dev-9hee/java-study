package cond.ex;

// 홀수 짝수 찾기
public class EvenOddEx {
    public static void main(String[] args) {
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
