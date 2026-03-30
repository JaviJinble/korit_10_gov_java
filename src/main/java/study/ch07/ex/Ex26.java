package study.ch07.ex;

public class Ex26 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i += 2;
        }
    // **출력:** `1 3 5
        // 1부터 시작, 2씩 증가, 5 이하. (1, 3, 5 출력 후 i=7이 되어 종료)

    }
}
