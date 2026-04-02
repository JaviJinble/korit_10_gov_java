package study.ch12.Ex;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 좌표값이 같으면 같은 객체처럼 판단하도록 equals() 재정의
    @Override
    public boolean equals(Object obj) {

        // 자기 자신과 비교하면 무조건 true
        if (this == obj) {
            return true;
        }

        // 비교 대상이 Point가 아니면 false
        if (!(obj instanceof Point)) {
            return false;
        }

        // Object 타입을 Point로 다운캐스팅
        Point other = (Point) obj;

        // x와 y가 모두 같으면 true
        return this.x == other.x && this.y == other.y;
    }
}

public class Ex08 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 5);
        Point p3 = new Point(1, 2);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}