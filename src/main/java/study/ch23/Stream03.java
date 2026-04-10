package study.ch23;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@AllArgsConstructor
class Student {
    private int studentCode;
    private String name;
    private int score;
}

public class Stream03 {
    public static void main(String[] args) {
        Map<String, Object> studentMap = Map.of(
                "studentCode", 20260001,
                "name", "김명준",
                "score", 70
        );
        Map<String, Object> studentMap2 = Map.of(
                "studentCode", 20260002,
                "name", "김명규",
                "score", 80
        );
        Map<String, Object> studentMap3 = Map.of(
                "studentCode", 20260003,
                "name", "김민성",
                "score", 90
        );
        List<Map<String, Object>> studentMapList = List.of(studentMap, studentMap2, studentMap3);
        List<Student> studentList = studentMapList.stream()
                .map(sm -> new Student(
                        (Integer) sm.get("studentCode"),
                        (String) sm.get("name"),
                        (Integer) sm.get("score")
                ))
                .toList();

        //
        // map 안은 그냥 “for문 한 바퀴”라고 생각해라
        // sm 하나 꺼내서 → Student 하나 만든다

        //.map(sm -> new Student(...))
        // “이걸 Student로 바꿔줘”

        // Stream
        // 반복을 숨김
        //
        // map()
        // 변환

        // Map 구조
        // key로 값 꺼냄

        // 형변환
        // Object → 실제 타입
    }
}
