package study.ch09.ex;
class Dog {
    String name;
    int age;
}
public class ex01 {
    public static void main(String[] args) {
        Dog d = new Dog(); // 객체를 생성
        System.out.println(d.name);
        System.out.println(d.age);
    }
}
// 출력: null
//      0
// 객체를 생성하면 필드는 기본값으로 자동 초기화된다. String(참조형)은 null, int는 0.
