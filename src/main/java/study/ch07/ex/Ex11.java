package study.ch07.ex;

public class Ex11 {
    public static void main(String[] args) {
        // switch 기본 다음 코드의 출력 결과를 쓰시오.
        int num = 2;
        switch (num) {
            case 1: System.out.println("하나"); break;
            case 2: System.out.println("둘"); break;
            case 3: System.out.println("셋"); break;
            default: System.out.println("기타");
        // 출력: 둘 -> num이 2이므로 case 2 에 매칭, break로 탈출
        }
    }
}
