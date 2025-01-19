package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
//        java: incompatible types: possible lossy conversion from double to int
//        java: 호환되지 않는 유형: double 에서 int 로의 가능한 손실 변환
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 출력:1
        System.out.println("doubleValue = " + doubleValue);
    }
}
