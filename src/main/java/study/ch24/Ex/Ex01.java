package study.ch24.Ex;

//### 문제 1. 숫자 스트림 기본
// Map→객체 변환, map, filter, toList 활용 문제입니다.
//`Stream.of(5, 12, 3, 8, 20, 1)`에서 10 이상인 숫자만 골라 리스트로 만드시오.
//
// 출력: [12,20]


import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> result = Stream.of(5, 12, 3, 8, 20, 1)
                .filter(n -> n >= 10)
                .toList();
    }
}
