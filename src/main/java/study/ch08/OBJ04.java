package study.ch08;

public class OBJ04 {
    public static void main(String[] args) {
        class Additon {

            void add(int a) {}
            void add(double b) {}
            void add(int a, double b) {}
            void add(double a, int b) {} // 호출하는 인자 값 타입 위치를 보고 가능하다
//            int add(int a, int b, int c) {return a + b + c;}
//            double add(int a, int b, int c) {return a + b + c;}
            // 오버로딩에서는 매개변수를 보고 이름이 같으면서 매개변수가 달라야한다. return 값은 상관없다0
        }

        Additon aaa = new Additon();
        aaa.add(10); // 인자 값을 넣어야한다

    }
}
