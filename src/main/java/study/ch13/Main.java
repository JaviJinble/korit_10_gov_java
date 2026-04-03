package study.ch13;

abstract class Person {
    private String lastName;
    private String firstName;

    public abstract void showName();
    public void showName2() {

    }
}

interface Person2 {
    public String lastName = ""; //
    public String firstName = "";

    public abstract void showName(); // public abstract 외부에서 가져다 쓰는 매서드라 생략.
    // private abstract 는 private 는 자기 자신에게만 공유
    // abstract 상속을 하는건데 자식과 부모관계에서는 공유가 안되면 안된다. 즉 private 을 쓸 수 없다.
    default void showName2() { // default를 사용하면 interface안에서도 일반 매서드 가능

    }

}

class Student extends Person { // 추상클래스 상속 Ctrl +I 를 눌러서 생산
    @Override
    public void showName() {

    }
}

class Student2 implements Person2 { // Ctrl +I 를 눌러서 생산
    @Override
    public void showName() {

    }
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Student(); // 추상클래스
        Person2 p2 = new Student2(); //
    }
}
