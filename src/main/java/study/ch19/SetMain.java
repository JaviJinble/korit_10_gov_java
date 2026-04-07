package study.ch19;

import java.util.HashSet;
import java.util.Set;



public class SetMain {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        // 값 추가(중복 x)
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        System.out.println(strSet);

        Set<User> userSet = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(2, "bbb"),
                new User(3, "ccc"),
                new User(4, "ddd")
        ));
        System.out.println(userSet);
        int id = 3;
        for (User user :userSet) { // 백엔드에서 많이 사용, set은 인덱스가 없어서 무조건 포이츠로 쓴다
            if (user.getId() == id) {
                System.out.println("3번 ID 찾음");
                System.out.println(user);
            }
        }
    }
}
