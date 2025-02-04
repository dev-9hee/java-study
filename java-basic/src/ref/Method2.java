package ref;

// Method1 코드 리펙토링
public class Method2 {
    public static void main(String[] args) {
        Student student1 = creatStudent("지희", 24, 90);
        Student student2 = creatStudent("민수", 25, 95);

        printStudent(student1);
        printStudent(student2);
    }

    // 객체 생성 및 초기화
    static Student creatStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
