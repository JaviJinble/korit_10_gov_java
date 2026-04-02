package study.ch10.ex;

import java.util.Arrays;

public class ex08 {
    public static void main(String[] args) {
        //int 배열 {1, 2, 3, 4, 5}의 요소 순서를 실제로 뒤집으시오. (새 배열 생성 없이 swap 사용)
        int[] nums = {1, 2, 3, 4, 5};
//        int[] reversedNums = new int[5];
//
//        for (int i = 0; i < nums.length; i++) {
//            reversedNums[nums.length - 1 - i] = nums[i];
//        }
//
//        System.out.println(Arrays.toString(reversedNums));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
