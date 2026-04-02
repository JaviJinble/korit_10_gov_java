package study.ch12.Ex;

class Shape {

    // 부모 클래스의 기본 넓이 메서드
    // 자식 클래스에서 필요에 따라 재정의(오버라이딩)한다
    double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;  // 반지름

    Circle(double radius) {
        this.radius = radius;
    }

    // 원의 넓이 = π × r × r
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;   // 가로
    double height;  // 세로

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 직사각형 넓이 = 가로 × 세로
    @Override
    double getArea() {
        return width * height;
    }
}

public class Ex06 {
    public static void main(String[] args) {

        // 부모 타입 배열에 자식 객체 저장
        // 이것이 다형성의 대표 예시
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6)
        };

        // 실제 생성된 객체의 getArea()가 호출됨
        for (Shape s : shapes) {
            System.out.printf("넓이: %.2f%n", s.getArea());
        }
    }
}