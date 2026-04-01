package study.ch10;

public class Array05_1 {
    public static void main(String[] args) {
        int danStart = 2;
        int danEnd = 9;
        int size = danEnd - danStart + 1;

        // 구구단 배열 만들기
        int[][] gugudan = new int[size][9];

        // gugudan 배열에 값넣기
        for (int i = 0; i < gugudan.length; i++) {
            // int dan = danStart + 1; 오답 코드 이 코드를 작성하면 danStart + 1 배열에서만 배열값 넣음
            int dan = danStart + i;
            for (int j = 0; j < gugudan[i].length; j++) {
                int num = j + 1;
                gugudan[i][j] = dan * num;
            }
        }

        // 출력
        for (int i = 0; i < gugudan.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < gugudan[i].length; j++) {
                System.out.print(gugudan[i][j] + " ");
            }
            System.out.println("]");
        }

    }
}
