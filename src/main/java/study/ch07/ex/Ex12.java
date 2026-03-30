package study.ch07.ex;

public class Ex12 {
    public static void main(String[] args) {
        // 다음 코드의 출력 결과를 쓰시오.
        int num = 2;
        switch (num) {
            case 1: System.out.println("A");
            case 2: System.out.println("B");
            case 3: System.out.println("C");
            default: System.out.println("D");
        }
        // 출력: B C D
        // break가 없으므로 case 2에서 시작하여 아래 모든 case를 연쇄 실행(fall-through).
    }
}
