package ex1.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class InputUtil {

    public static int nextInt() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = bufferedReader.readLine().trim();
            // long t1 = System.nanoTime(); // 성능 테스트 로직이 시작되는 위치
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    stringBuilder.append(input.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            int result = Arrays.stream(stringBuilder.toString().split(","))
                    .filter(str -> !str.isEmpty())
                    .map(Integer::parseInt)
                    .findFirst()
                    .get();
            // long t2 = System.nanoTime(); // 성능 테스트 로직이 종료되는 위치
            //  System.out.println(t2 - t1);
            return result;
        } catch (IOException e) {
            return 0;
        }
    }

    public static List<Integer> nextInts() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = bufferedReader.readLine().trim();

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) > 47 && input.charAt(i) < 58) {
                    stringBuilder.append(input.charAt(i));
                } else {
                    stringBuilder.append(",");
                }
            }
            String[] splitStr = stringBuilder.toString().split(",");
            List<Integer> strList = Arrays.stream(splitStr)
                    .filter(str -> !str.isEmpty()).map(Integer::parseInt)
                    .toList();
            return strList;
        } catch (IOException e) {
            return List.of();
        }
    }
}
