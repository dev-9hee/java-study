package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "지희";
        student1.age = 24;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "민수";
        student2.age = 25;
        student2.grade = 100;

        // 배열 선언과 초기화
        Student[] students = new Student[]{student1, student2};

        // 출력 for문 적용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " + students[i].grade);
        }
        System.out.println();
        // 반복 요소를 변수에 담아서 처리
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
        System.out.println();
        // 향상된 for문
        for (Student s : students) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}
