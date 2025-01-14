package loop.ex;

// 누적 합 계산
public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;

        for (int i=1; i<=max; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
