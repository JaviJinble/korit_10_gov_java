package study.ch07.ex;

public class Ex30 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        //**출력:** `10`
        //
        //do-while은 **최소 1번 실행**. 10을 출력 후 i=11, `11 <= 5`는 false → 종료.
    }
}
