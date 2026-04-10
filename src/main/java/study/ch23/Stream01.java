package study.ch23;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
class CustomStream<T, R> {
    private List<T> list;

    public List<R> map(Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T data : list) {
            newList.add(function.apply(data));
        }
        return newList;
    }
}

public class Stream01 {
    public static void main(String[] args) {

        // map 이러한 작업을 map이라 한다 반복(치환)
        List<String> strNums = List.of("10", "20", "30");
        List<Integer> nums = new ArrayList<>();

//        // Stream
//        List<Integer> nums = strNums.stream()
//                .map(Integer::parseInt)
//                .toList();



//        for (String s : strNums) {
//            nums.add(Integer.parseInt(s));
//        }
        System.out.println(nums);

        System.out.println(strNums.stream().map(str -> Integer.parseInt(str) * 10).toList());


        CustomStream<String, Integer> customStream = new CustomStream<>(strNums);
        List<Integer> num2 = customStream.map(str -> Integer.parseInt(str) * 10);
//        Function<String, Integer> f = str -> Integer.parseInt(str) * 10;
//        List<Integer> num2 = customStream.map(f);
        System.out.println(num2);

        CustomStream<String, String> customStream2 = new CustomStream<>(List.of("준링","준명","명준"));
        System.out.println(customStream2.map(name -> "김" + name));

        System.out.println(List.of("명준","명규","민성").stream().map(name -> "김" + name).toList());


        System.out.println(new CustomStream<String, Integer>(strNums).map(str -> Integer.parseInt(str) * 10));


    }
}
