package study.ch07.ex;

public class Ex31 {
    public static void main(String[] args) {
        // 코드 A
        int x = 100;
        while (x < 5) {
            System.out.println("A 실행");
            x++;
        }
        // 코드 A 출력: (없음 — 아무것도 출력되지 않음)
        // 100 < 5가 false이므로 while 본문이 실행되지 않음.

        // 코드 B
        int y = 100;
        do {
            System.out.println("B 실행");
            y++;
        } while (y < 5);
        // 코드 B 출력: B 실행
        //do-while은 조건 검사 전에 먼저 1번 실행. 이후 101 < 5가 false → 종료.
    }
}
