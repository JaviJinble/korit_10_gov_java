package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        // 생명주기 개념 이해. main() { } 끝나는 곳 까지
        // 정의된거와 선언된것들은 살았있다 -> 이유는 코드를 한번 다 읽어서(분석을 해서)
        // 분석을 끝낸 다음에 실행을 한다.


        class Additon { // class 정의
            int defaultNumber = 10; // 기본값 -> defaultNumber 변수 선언하고 10으로 초기화.


            Additon () { // Additon Additon () 생략된 상황이다 해당 클래스 자료형이어야 한다.
                System.out.println("생성자 호출");
                // return 1000; 메모리 주소 -> 즉 return this; 라는 말이다.
                // 생략된 부분
            }

            // 1. 중복 코드 제외.
            // 2. 기능별로 코드로 나눌 때 -> 단일 책임 원칙. 클린코드 책 내용에 있음
            int add(int a, int b) { // return타입이 int 인 10인 매서드 (안에 매개변수는 int형으로 받음)
                System.out.println("변수a: " + a);
                System.out.println("변수b: " + b);
                System.out.println("기본값: " + defaultNumber);
                return a + b + defaultNumber; // a + b + defaultNumber -> 리턴 값 int
            }

            void printDefaultNumber() {
                System.out.println();
            }


        }// 정의

        Additon add1 = new Additon(); // Additon객체 생성 -> 객체명 add1
                                        // add1변수에 대입
                                        // 선언
        int num = 1000; // num에 1000저장
                        // 선언
        int num2 = add1.add(100, 200); // num2는 add1에 있는 int add() 실행.(int 100, int 200)값 넣고 매서드 실행.
                                        // . 참조라고 한다
                                        // char 는 들어가진다 왜? int 는 8byte, char 는 4byte 즉 넣는다면 아스키코드로 출력
                                        // 선언
        int num3 = add1.add(400, 500);

        System.out.println(num + num2);
        System.out.println(num3);
    }
}
