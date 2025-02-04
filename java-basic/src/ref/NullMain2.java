package ref;

// NullPointerException
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; // 지역 변수 null
        // 참조할 주소가 존재하지 않음
        data.value = 10;// NullPointerException 예외 발생, null 에 . 을 찍음
        System.out.println("data = " + data.value);
    }
}
