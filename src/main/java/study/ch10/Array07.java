package study.ch10;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 10, 4, 1};
        // nums[] 배열에 오름차순으로 정렬하면 1 2 4 5 10
        int[] sortedNums = nums.clone();
        // 오름차순(기본)
        Arrays.sort(nums);

        // 버블 정렬


        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(Arrays.stream(sortedNums).boxed().toList());
        System.out.println(Arrays.toString(nums));
        System.out.println("---------------------------------------------");
        // 버블 정렬의 핵심
        // 버블 정렬은 옆에 있는 두 값을 비교해서,
        // 앞의 값이 더 크면 서로 자리를 바꾸는 방식
        // 5, 2 가 있으면 2, 5로 5가 2보다 크니까 자리를 바꾼다
        // 한 바퀴 끝나면 제일 큰 수 인 10아 맨 뒤로 가 있다
        // 즉, 버블 정렬은 한 바퀴 돌 때마다 큰 값 하나가 뒤로 학정.
        // 가장 안쪽 비교 1회
        /*
            if (nums[j] > nums[j + 1]) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
            } 값 교환 코드
        *
        **/

        // 전체 버블 정렬 코드
        int[] nums1 = {5, 7, 3, 9, 2};
        for (int i = 0; i < nums1.length; i++) { // 몇 바퀴 돌지 정함
            for (int j = 0; j < nums1.length - 1 - i; j++) { // 한 바퀴 안에서 옆자리 비교
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                } // 값 교환 코드
            }
        } // for문 바깥 for문과 안쪽 for문은 각각의미하는게 있다.

        // nums1.length - 1 - i는 이미 뒤쪽은 정렬이 끝났기 때문에 안 봐도 된다

        System.out.print("버블 정렬 적용: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums1[i] + " ");
        }


        // 선택 정렬 (Selection Sort)
        // 가장 작은 값을 찾아서 앞으로 보내는 방식 -> 한 칸씩 확정하면서 최소값을 앞으로 끌어온다

    }
}
