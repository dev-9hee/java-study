package oop1;

// 관련된 데이터 + 기능
public class ValueObject {
    int value; // 멤버 변수 (필드)

    void add() { // 메서드
        value++;
        System.out.println("숫자 증가 value=" + value);
    }
}
