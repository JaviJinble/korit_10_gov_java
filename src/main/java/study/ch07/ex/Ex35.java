package study.ch07.ex;

public class           Ex35 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) break;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        //**출력:**
        //i=1, j=1
        //i=2, j=1
        //i=3, j=1

        // break는 안쪽 for문만 탈출한다. 바깥 for문은 계속 실행되므로 i=1,2,3 각각에서 j=1만 출력.
    }
}
