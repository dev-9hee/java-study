package scanner.ex;

// 문제 - 변수 값 교환
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
