package loop.ex;

// 짝수 출력 문제
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
