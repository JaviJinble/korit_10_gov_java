package study.ch19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(100, "aaa");
        userMap.put(2000, "bbb");
        userMap.put(30000, "ccc");
        userMap.put(400000, "ddd"); // list 와 차이점은 list는 순서가 있지만 Map은 키를 내가 원하는 숫자로 바꿀 수 있다
        System.out.println(userMap);
        System.out.println(userMap.get(30000));

        List<Map.Entry<Integer, String>> userEntries = new ArrayList<>(userMap.entrySet());
        System.out.println(userEntries.get(0).getKey());
        System.out.println("------");

        // map은 Key키와 Value값을 entry로 묶어 set
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
