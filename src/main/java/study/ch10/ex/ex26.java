package study.ch10.ex;

import java.util.Arrays;

public class ex26 {
    public static void main(String[] args) {
        // ### 문제 26. 3×3 배열 생성
        //
        //3×3 int 배열을 생성하고 1~9로 채운 뒤 행렬 형태로 출력하시오.
        //출력:
        //1 2 3
        //4 5 6
        //7 8 9
        int[][] nums = new int[3][3]; // 3x3 2차원 배열

        // 1 부터 9까지 채우기 위한 변수
        int num = 1; // num 변수 선언 초기화

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num1 = j + 1;
                nums[i][j] = num + (i * nums[i].length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }


        // 배열 값 채우기 (행 → 열 순서)
        for (int i = 0; i < 3; i++) { //행
            for (int j = 0; j < 3; j++) { // 열
                nums[i][j] = num++;     // 값 넣고 증가
            }
        }

        for(int i = 0; i < 3; i++) {//  행 반복
            for (int j = 0; j < 3; j++) { // 열 반복 글간격 띄어쓰기
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); //  줄 바꿈
        }

//        System.out.println(Arrays.toString(nums));
        // 위 방법으로 출력하면 [[I@15db9742, [I@6d06d69c, [I@7852e922] 출력된다.
        // [I = int 배열
        //@주소값 = 메모리 주소
        // 값이 아니라 주소 출력됨

        System.out.println(Arrays.deepToString(nums));// 출력 결과 : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        // 메서드	대상
        //toString()	1차원 배열
        //deepToString()	2차원 배열
    }
}
