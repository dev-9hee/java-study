package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 메서드 오버로딩
    MemberConstruct(String name, int age) {
        // 생성자 코드의 첫줄에만 작성 가능
        this(name, age, 100); // 아래 자신의 생성자 호출
    }

    // 생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
