package study.ch10.ex;

import java.util.Arrays;

public class ex21 {
    public static void main(String[] args) {
        //int 배열 {5, 2, 8, 1, 9}를
        //버블 정렬 알고리즘으로 오름차순 정렬하시오.

        //버블 정렬 = 이중 for + nums[j]와 nums[j+1] 비교
        int[] nums = {5, 2, 8, 1, 9};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
