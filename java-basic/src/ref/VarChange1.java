package ref;

// 기본형 변수 대입
public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // b = 10
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}
