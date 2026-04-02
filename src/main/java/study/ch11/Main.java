package study.ch11;

class Animal {
    private String name;


    // 기본 생성자 (NoArgumentConstructor)
    public Animal() {

    }

    // 전체 생성자(AllArgumentConstructor)
    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "(이)가 밥을 먹는다");
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
    }

}

class Dog extends Animal{ // 부모 Animal 을 상속.
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(super.getName() + "(이)가 멍멍한다.");// super는 생략되어 있는 상태이다.
        //System.out.println(getName() + "(이)가 멍멍한다.");
    }

    public void showInfo() {
        super.showInfo(); // 재정의 showInfo 부모의 매서드를 자식에서 재정의
        System.out.println("품종: " + breed);
    }
}

    class Cat extends Animal{
        private String color;

        public Cat(String name, String color) {
            super(name);
            this.color = color;
        }

        public void grooming() {
            System.out.println(super.getName() + "(이)가 그루밍을 한다.");
        }

        public void showInfo() {
            super.showInfo();
            System.out.println("색상: " + color);
        }
    }

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(); // 생성자
        // Animal animal = new Animal(); // 생성자
        // public Animal() {
        //
        //    } ---- 추가함
        Dog dog = new Dog("포치", "진돗개"); // 생성자
        Cat cat = new Cat("톰", "파랑색");

        dog.eat();
        cat.eat();

        dog.bark();
        cat.grooming();

        dog.showInfo(); // 오버라딩 나옴 즉 Animal에 있는 showInfo명과 dog안에 있는 showInfo명이 같을땐 일반적으로는 안된다
        // showInfo 부모의 매서드를 자식에서 재정의
        // 업캐스팅 개념 가능하다
        cat.showInfo();


        Animal[] animals = new Animal[6];

        animals[0] = new Animal("그냥 동물");
        animals[1] = new Cat("야옹이", "화이트");
        animals[2] = new Dog("콩이", "말티즈");
        animals[3] = new Dog("두부", "말티즈");
        animals[4] = new Cat("네오", "블랙");
        animals[5] = new Animal("무슨 동물");

        double d = 10;
       // Animal a = new Dog("a", "b");

        for (Animal a : animals) { // 다형성을 설명한다.
            a.showInfo();
            if (a instanceof Dog) {
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).grooming();
            } else {
                System.out.println("추가 기능 없음");
            }
        }

    }
}
