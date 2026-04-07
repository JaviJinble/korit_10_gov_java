package study.ch19.ex;
//### 문제 3. 리스트 역순 + 필터
//ArrayList에 1~20 정수를 저장한 뒤, 3의 배수만 역순으로 출력하시오.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            nums.add(i+1);
        }

        for (int i = 0; i < 20; i++) {
            int num = nums.get(i);
            if (num % 3 == 0) result.add(0, num); // 역순으로 넣어 준다.
        }

        System.out.println(result);

        for (int i = 0; i < 20; i++) {
            int num = nums.get(i);
            if (num % 3 == 0) result2.add(num); // 정순으로 넣어 준다
        }

        Collections.reverse(result2);
        System.out.println(result2);

    }
}
