package pack.a;

public class User {
    // 다른 패키지에서 이 클래스의 생성자를 호출하려면 public 을 사용
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
}
