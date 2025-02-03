package class1;

// 학생 정보 출력 프로그램 v2 (배열 사용)
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4", "학생5"};
        int[] studentAges = {15, 16, 17, 10, 16};
        int[] studentGrades = {90, 80, 100, 80, 50};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
    }
}
// 이름, 나이, 성적을 각각 따로 나누어서 관리하는 것은 특정 학생의 데이터를 변경할 때 실수할 가능성이 높음.
// 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것
// 각각의 학생 별로 본인의 이름, 나이, 성적을 관리
