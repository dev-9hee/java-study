package ref;

// null -> 값이 존재하지 않음, 없음
public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // 참조값이 null

        data = new Data(); // 객체 생성, 참조값 존재
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
    }
}
// 객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료할 때 까지 계속 생존
// 해당 객체를 참조하는 곳이 모두 사라지면 그때 JVM은 필요 없는 객체로 판단다고 GC(가비지 컬렉션)를 사용해서 제거
