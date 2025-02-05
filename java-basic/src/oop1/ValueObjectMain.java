package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        ValueObject valueObject = new ValueObject();
        valueObject.add(); // 메서드 사용
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자=" + valueObject.value); // 필드 사용
    }
}
