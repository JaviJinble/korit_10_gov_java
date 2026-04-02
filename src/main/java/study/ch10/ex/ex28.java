package study.ch10.ex;

public class ex28 {
    public static void main(String[] args) {
        // ### 열별 합계
        //위와 같은 배열에서 각 열의 합계를 구하여 출력하시오.
        //출력:
        //0열 합계: 120
        //1열 합계: 150
        //2열 합계: 180
        int[][] arr = {
                { 10, 20, 30},
                { 40, 50, 60},
                { 70, 80, 90},
        };

        // 핵심 힌트
        // 바깥 for → 행
        // 안쪽 for → 열

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // 초기화

            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println(i + "열 합계: " + sum);

        }

    }
}
