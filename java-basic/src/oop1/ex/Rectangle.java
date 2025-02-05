package oop1.ex;

public class Rectangle {
    // 속성
    int width; // 멤버변수, 자동초기화
    int height;

    // 기능
    /**
     * 넓이
     */
    int calculateArea() {
        return width * height;
    }

    /**
     * 둘레 길이
     */
    int calculatePerimeter() {
        return 2 * (width + height);
    }

    /**
     * 정사각형 여부
     */
    boolean isSquare() {
        return width == height;
    }
}
