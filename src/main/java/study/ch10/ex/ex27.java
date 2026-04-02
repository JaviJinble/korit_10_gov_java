package study.ch10.ex;

public class ex27 {
    public static void main(String[] args) {
        //  각 행의 합계를 구해서 출력
        // 출력 목표
        //0행 합계: 60
        //1행 합계: 150
        //2행 합계: 240
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
        };
        // 핵심 힌트
        // 바깥 for → 행
        // 안쪽 for → 열

        // 행 반복
        // 반드시 해야하는 것
        // 각 행마다 sum 초기화
        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // 각 행마다 합계 초기화 //  여기 !!!!!
            // i + "행 합계
            // 열 반복
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; // sum += arr[i][j]; 합계
            }

            System.out.println(i + "행 합계: " + sum);

        }


    }
}
