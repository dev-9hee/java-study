package loop;

// do-while 문은 최초 한번은 항상 실행
public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}
