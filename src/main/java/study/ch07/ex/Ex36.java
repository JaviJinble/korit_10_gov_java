package study.ch07.ex;

public class Ex36 {
    public static void main(String[] args) {
        // 코드 A: break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }

        System.out.println();

        // 코드 A 출력: 1 2
        //i=3에서 break → 반복 종료. 3, 4, 5는 출력 안 됨.


        // 코드 B: continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        // 코드 B 출력: 1 2 4 5
        // i=3에서 continue → 3만 건너뛰고 반복 계속.
    }
}
