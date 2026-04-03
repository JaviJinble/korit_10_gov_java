package study.ch12.Ex;
/**
 * ### 문제 1. 기본 상속 구현
 *
 * `Animal` 클래스를 상속하는 `Dog`, `Cat` 클래스를 작성하시오.
 *
 * - `Animal`: 필드 `String name`, 생성자, 메서드 `void eat()` → "(이름)이(가) 밥을 먹는다" 출력
 * - `Dog`: Animal 상속, 필드 `String breed`, 생성자(super), 메서드 `void bark()` → "멍멍!" 출력
 * - `Cat`: Animal 상속, 필드 `boolean isIndoor`, 생성자(super), 메서드 `void meow()` → "야옹!" 출력
 * */
class Animal {
    String name;  // 동물 이름

    // 부모 클래스 생성자
    Animal(String name) {
        this.name = name;
    }

    // 부모가 공통으로 가지는 기능
    void eat() {
        System.out.println(name + "이(가) 밥을 먹는다");
    }
}

class Dog extends Animal {
    String breed;  // 강아지 품종.

    // 자식 생성자
    // super(name)으로 부모의 name 초기화
    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Dog만의 고유 기능
    void bark() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    boolean isIndoor;  // 실내묘 여부

    // 자식 생성자
    // super(name)으로 부모의 name 초기화
    Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    // Cat만의 고유 기능
    void meow() {
        System.out.println("야옹!");
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Dog d = new Dog("바둑이", "진돗개");
        d.eat();   // 부모에게 물려받은 메서드
        d.bark();  // 자식 고유 메서드

        Cat c = new Cat("나비", true);
        c.eat();   // 부모에게 물려받은 메서드
        c.meow();  // 자식 고유 메서드
    }

}
