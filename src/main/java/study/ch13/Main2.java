package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal() {} // 일반 생상자
    public AbstractAnimal(String name) {this.name = name;} // 매개변수로 name을 넘겨줘야한다.

    public String getName() { //Alt + Ins 키 단축키
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();

}

interface  Swimmable {
    void swim();
}

class Duck extends AbstractAnimal implements Flyable, Swimmable {
    // 관계를 봐야한다 Duck은 AbstractAnimal을 상속관계이고 즉 단일상속. Flyable, Swimmable의 기능이 있다
    // implements 다중구현
    public Duck() { // Duck안에 생략되었다.
        super(); // AbstractAnimal 를 호출.
    }

    @Override
    public void fly() {
        System.out.println("공중날기~!!");
    }

    @Override
    public void swim() {
        System.out.println("파도타기~!!");
    }

    public Duck(String name) {
        super(name);
    }

}

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        // 업캐스팅
        // 업캐스팅을 하는 이유 ?
        // 업캐스팅 = 다형성을 구현하기 위해 사용하며, 코드 재사용성과 확장성을 높인다
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();


        duck.fly();
        duck.swim();
        duck.setName("꾸왁스");
        System.out.println(duck.getName());

        animal.setName("옆집 고라파덕");
        System.out.println(animal.getName());

        flyable.fly();

        swimmable.swim();
    }
}
