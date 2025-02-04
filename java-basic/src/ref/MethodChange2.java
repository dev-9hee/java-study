package ref;

// 참조형 메서드 호출
public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // 객체 생성
        dataA.value = 10; // 멤버 변수 값 대입
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        changeReference(dataA); // 참조값이 변수로 들어감
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
