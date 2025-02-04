package ref;

// 참조형 변수 대입
public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // 객체 생성
        dataA.value = 10;
        Data dataB = dataA; // dataA의 참조주소 복사

        // 참조값 같음
        System.out.println("dataA 참조값=" + dataA); // 참조값
        System.out.println("dataB 참조값=" + dataB); // 참조값
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        // 참조값이 같기 때문에 해당 주소로 가면 변경된 같은 값이 있음
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        // 참조값이 같기 때문에 해당 주소로 가면 변경된 같은 값이 있음
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}
