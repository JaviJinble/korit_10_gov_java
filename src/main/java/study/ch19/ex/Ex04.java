package study.ch19.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//### 문제 4. 두 리스트 병합 정렬
//두 ArrayList를 합치고 오름차순 정렬하시오.
// listA: [5, 2, 8]
// listB: [3, 9, 1]
// 결과: [1, 2, 3, 5, 8, 9]

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> listA = List.of(5, 2, 8);
        List<Integer> listB = List.of(3, 9, 1);
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        System.out.println(result);
        Collections.sort(result);
        System.out.println(result);

        // 버블정렬로도 해도됨


//        listA.addAll(listB); // 두 리스트 병합
//        Collections.sort(listA);
//        System.out.println(listA);

    }
}
