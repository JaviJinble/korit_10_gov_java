package study.ch10;

import java.util.Random;

public class Array06_1 {
    public static void main(String[] args) {
        // nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오.
        // nums[] 배열 생성
        int[] nums = new int[10];
        // 첫 값으로 초가화
        int max = nums[0];
        int min = nums[0];

        // Random
        Random random = new Random();

        // nums[]에 1~100까지 수를 랜덤으로 들어가는데 nums.length 크기(길이)만큼 반복한다.
        // int[] nums = new int[10]; 줄을 보면 10으로 지정했으니 10개의 1~100 까지의 수가 랜덤으로 배열에 대입된다.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1; // 0을 출력하고 싶지 않을때 nums[0] 일때 1이 들어가게 할려면 +1을 해주면 된다.
        }

        // nums[] 출력
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + ((i < nums.length - 1) ? ", " : ""));
            // nums[] 출력을 할려면 nums.length 길이 만큼 반복을 해줘야 한다.
            // 출력때 nums[i] 다음에는
            // (i < nums.length - 1) ? ", " : "")
            //마지막 요소에는 쉼표 안 붙이려고 쓰는 코드
        }


        for (int i = 0; i < nums.length; i++) {
            if (i ==  0) {
                max = nums[i];
                min = nums[i];
                continue;
            }
            if (nums[i] > max) {
                max = nums[i]; // 최대값 대입
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("\n최대값: " + max);
        System.out.println("최소값: " + min);

    }
}
