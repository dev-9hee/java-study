package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 객체 생성
        System.out.println("bigData.count=" + bigData.count); // 0
        System.out.println("bigData.data=" + bigData.data); // null

        // 오류 해결
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
