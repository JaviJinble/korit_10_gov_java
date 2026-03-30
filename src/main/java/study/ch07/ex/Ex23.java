package study.ch07.ex;

public class Ex23 {
    public static void main(String[] args) {
        // 다음 코드의 출력 결과를 쓰시오.
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        // 출력:
        //1 2 3
        //2	4 6
        //3	6 9
        // i * j의 결과를 탭으로 구분하여 출력. 3×3 곱셈표.

    }
}
