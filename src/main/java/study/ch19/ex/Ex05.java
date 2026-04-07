package study.ch19.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ### 문제 5. 검색 & 수정
//
//ArrayList에 과일 이름을 저장하고, 특정 과일을 찾아 수정하는 코드를 작성하시오.
// 초기: ["사과", "바나나", "포도", "딸기"]
// "포도"를 "망고"로 변경
// "체리"를 맨 앞에 추가
// "딸기"를 삭제
// 최종: ["체리", "사과", "바나나", "망고"]
public class Ex05 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("사과", "바나나", "포도", "딸기"));
        int foundIndex = fruits.indexOf("포도");
        fruits.set(foundIndex, "망고");
        fruits.add(0,"체리");
        fruits.remove("딸기");
        System.out.println(fruits);

    }
}
