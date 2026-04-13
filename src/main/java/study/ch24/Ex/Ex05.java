package study.ch24.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

//다음 Map 리스트에서 "name" 값만 추출하여 `List<String>`으로 만드시오.
//
//```java
//List<Map<String, Object>> people = List.of(
//    Map.of("name", "김자바", "age", 25),
//    Map.of("name", "이파이", "age", 30),
//    Map.of("name", "박고랭", "age", 22)
//);
// 출력: [김자바,이파이,박고랭]
@Data
@AllArgsConstructor
class People {
    private int age;
    private String name;
}

public class Ex05 {

    public static void main(String[] args) {
        List<Map<String, Object>> people = List.of(
                Map.of("name", "김자바", "age", 25),
                Map.of("name", "이파이", "age", 30),
                Map.of("name", "박고랭", "age", 22)
        );

        List<String> nameList = people.stream()
                .map(sm -> (String) sm.get("name"))
                .toList();

        System.out.println(nameList);
    }
}