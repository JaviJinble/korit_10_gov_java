package study.ch10;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100) + 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ((i < nums.length - 1) ? ", " : ""));
        }

        // nums에 저장된 랜덤한 숫자 중 최대값과 최소값을 각각 구하시오.
        int max = nums[0];
        int min = nums[0];
        // 첫 값으로 초기화
        //
//        for (int i = 0; i < nums.length; i++) {
//             max = nums[i] > nums[i + 1]
//                    ? nums[i] > nums[i + 2]
//                                    ? nums[i] > nums[i + 3]
//                                      ? nums[i]
//                                      : nums[i + 3]
//                    : nums[i + 2]
//                    : nums[i + 1];
//        } // 시간 복잡도 가 높아지면 알고리즘에서 비용낭비라 표현한다


        for (int i = 0; i < nums.length; i++) {
            if (i ==  0) {
                max = nums[i];
                min = nums[i];
                continue;
                // continue;을 사용할꺼면 else을 사용해 작성해야한다
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

        }
        System.out.println();
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
