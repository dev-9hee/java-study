package method.ex;

// 문제 - 반복 출력 리펙토링
public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, world!", 3);
        printMessage("Hello, world!", 5);
        printMessage("Hello, world!", 7);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
        System.out.println();
    }
}
