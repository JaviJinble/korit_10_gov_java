package study.ch12;

abstract class AA {

}
class BB extends AA {

}
class CC extends BB {

}

class MM {
    public static void main(String[] args) {
        // AA a = new AA();// 추상클래스 라서 생성 불가능
        BB b = new BB();
        AA b2 = new BB();
        AA c = new AA() { // 이름 없는 객체가 AA에 대입 되어지고 있는 상황이다

        };
        AA cc = new CC(); //
        AA ccc = new BB() { // BB를 상속받은 이름 없는 객체를 AA에 대입 한다는 얘기

        };
        BB cccc = new BB() { //  BB도 익명 클래스로 만들수 있다

        };
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 업캐스팅 가능해짐 Dog.java에서
        // Ctrl + i 를 해서 구현가능한 매서드 만들어주어
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal() { // Animal 생성
            @Override
            public void eat() {

            }
        };

    }
}
