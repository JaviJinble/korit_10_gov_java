package study.ch14;
// 모드 클래스는 객체이다.
class Animal {

}

class Duck extends Animal {

}


public class Main {
    public static void main(String[] args) {
        // 최상위 클래스 (Object) // 클래스에서는 자동 AutoBoxing이 일어난다
        Object a = 10;
        Object b = 3.14;
        Object c = "김명준";
        Object d = 'a';
        Object e = new Animal();

        // Wrapper Class(래퍼 클래스)
        Integer integer = (Integer) 10; // (Integer) 10 // 일반자료형 -> 클래스자료형 (Boxing)
        int i = (int) integer; // (int) // 클래스자료형 -> 일반자료형 (UnBoxing)
        // 자바는 Boxing, UnBoxing이 자동 -> AutoBoxing


        // int i2 = null; // null은 객체가 없다 라는 뜻 int 는 객체가 아니므로 null은 안된다
        Integer integer2 = null; //

        // Object는 숫자의 개념이 없다 즉 데이터 객체는 데이터는 덧셈 개념이 없다
        System.out.println(((int) a)+((double) b)); //(int) // 클래스자료형 -> 일반자료형 (UnBoxing)


    }
}
