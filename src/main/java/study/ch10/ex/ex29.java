package study.ch10.ex;

public class ex29 {
    public static void main(String[] args) {
        //### 문제 29. 2차원 최대값
        //2차원 배열 {{3,7,1},{9,2,6},{4,8,5}}에서 전체 최대값과 그 위치(행, 열)를 구하여 출력하시오.
        //출력: `최대값: 9, 위치: [1][0]`
        int[][] arr = {
                {3, 7, 1},
                {9, 2, 6},
                {4, 8, 5},
        };
        // 핵심 힌트
        // 바깥 for → 행
        // 안쪽 for → 열
        int max = arr[0][0]; // 초기화
        int row = 0; // 위치
        int col = 0; //  위치

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("최대값: " + max + ", 위치: [" + row + "][" + col + "]");

    }
}
