package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (p.test(s)) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange(int multNum, Function<Integer, List<Integer>> f) {
        return f.apply(multNum);
    }

    public static void main(String[] args) {
//        String searchName = "김명규";
        List<String> names = List.of("김명준","김명규","김민성");
        String foundName = search(names, name -> name.contains("김명")); // name -> name.contains(searchName)); 매서드의 조건을 여기서 바꿀수 있다
        System.out.println(foundName);


        applicationMain(() -> {
            List<Integer> numList = createNumListOfRange(10, (multNum) -> { // 위에서 바꾸지 않고 로직을 바꿀수 있다 람다식을 쓰는 이유는 기존 코드를 건들리지 않고 간결하게 가능
                int start = 10;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                    nums.add(i * multNum);
                }
                return nums;
            });

            System.out.println(numList);
        }); // 호출 할때 람다식 사용
        System.out.println("프로그램 진짜 완전 종료");

    }
}
