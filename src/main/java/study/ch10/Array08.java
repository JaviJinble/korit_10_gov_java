package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = { "김명준", "김명규", "김민성"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names);
        }

        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 10;
        }// 기존 for 사용: 인덱스가 필요할 때. 값을 수정할 때. 역순 순회 할때


        for (int num : nums) {
            num = num * 10;
        } // 단순 조회(읽기) 작업 할때 쓴다

        for (int num : nums) {
            System.out.println(num);
        }


    }
}
