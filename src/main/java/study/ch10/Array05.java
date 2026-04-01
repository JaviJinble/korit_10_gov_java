package study.ch10;

public class Array05 {
    public static void main(String[] args) {
        // 구구단을 배열에 시작 단부터 끝단까지 자동으로 저장하여 출력하는 프로그램
        int danStart = 2;
        int danEnd = 9;
        int size = danEnd - danStart + 1;


        // 행 = 단, 개수, 열 = 1 ~ 9
        // 구구단 배열 만들기
        int[][] gugudan = new int[size][9];

        // gugudan[i].length -> 열의 크기

        // 값 저장
        for (int i = 0; i < gugudan.length; i++) {
            int dan = danStart + i; // dan = 2 3 4 5 6 7 8 9
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
