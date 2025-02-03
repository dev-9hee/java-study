package class1;

// 학생 정보 출력 프로그램 v3 (클래스 도입)
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // Student 객체 생성
        student1.name = "지희";
        student1.age = 24;
        student1.grade = 90;

        Student student2 = new Student(); // 새로운 Student 객체 생성
        student2.name = "민수";
        student2.age = 25;
        student2.grade = 100;

        System.out.println("[ 참조값 확인 ]");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println();

        System.out.println("[ 출력 ]");
        System.out.println("이름 : " + student1.name + ", 나이 : " + student1.age + ", 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + ", 나이 : " + student2.age + ", 성적 : " + student2.grade);
    }
}
