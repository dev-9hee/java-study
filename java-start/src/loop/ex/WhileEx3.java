package loop.ex;

// 누적 합 계산
public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
