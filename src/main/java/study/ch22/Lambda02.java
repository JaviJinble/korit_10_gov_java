package study.ch22;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda02 {
    public static void main(String[] args) {

        Runnable r = () -> {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        };

//        Runnable r = () -> {}; // 실행문에 많이 사용 쓰레드
        Consumer<String> c1 = str -> System.out.println("문자열: " + str); // 문자열을 소비한다
        Consumer<List<Integer>> c2 = numList -> {
            for (Integer i : numList) {
                System.out.println("i: " + i);
            }
        }; // 문자열을 소비한다

        c2.accept(List.of(10, 20, 30, 40)); // 매개변수 정수를 넣어준다
        c1.accept("김명준"); // 매개변수 문자열 넣어준다
        r.run(); // 매개변수가 없다

        Supplier<Character> s1 = () -> {
            System.out.println("Supplier 객체 호출");
            String str = "abcd";
            return str.charAt(0);
        };

        Supplier<Character> s2 = () -> "abcd".charAt(0);

        System.out.println(s1.get());
        System.out.println(s2.get());

        String name = "김명준";
        Supplier<Character> s3 = () -> { // 같은 지역에 있는 것을 바로 쓸 수 있다.
            System.out.println(name);
            return name.charAt(0);
        };
        System.out.println(s3.get());

        /**
         * strData -> {// 매서드 오버라이드 니 기억할꺼!
         *             Integer numData = Integer.parseInt(strData);
         *             return numData;
         *         };
         * */

        Function<String, Integer> intParser = strData -> {// 매서드 오버라이드 니 기억할꺼!
            Integer numData = Integer.parseInt(strData);
            return numData;
        };
        System.out.println(intParser.apply("1000") + 200);

        Predicate<String> p = n -> "김명준".equals(n);
        System.out.println(p.test("김명주"));

    }
}
