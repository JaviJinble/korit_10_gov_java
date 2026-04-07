package study.ch19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        // 값 추가
        numList.add(100);

        // 해당 인덱스 위치에 값 추가
        numList.add(0,100);

        // 값 조회
        Integer n1 = numList.get(1);
        System.out.println(n1);

        // 여러 값 한번에 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(3000);

        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1, numList2);
        System.out.println(numList);

        boolean hasFound = numList.contains(2000);
        System.out.println(hasFound);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        for (Integer num : numList) {
            System.out.println(num);
        }

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        System.out.println(strList);

        List<String> strList2 = new LinkedList<>();
        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");
        System.out.println(strList2);

        List<String> imStrList = List.of("a", "b", "c", "d"); // 고정데이터를 만들때 사용 즉 추가 수정이 없을 때 사용
//        imStrList.add("e"); 불변 리스트여서 수정 불가능
        System.out.println(imStrList);
        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList); // 수정이 원할때 addAll에 넣어 수정과 추가가 가능하다
        nonImStrList.add("e");
        System.out.println(nonImStrList);
        List<String> nonImStrList2 = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println(nonImStrList2);
    }
}
