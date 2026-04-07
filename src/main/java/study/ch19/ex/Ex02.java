package study.ch19.ex;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// ### 문제 2. 중복 제거
//ArrayList에서 중복 요소를 제거한 새 리스트를 만드시오. (순서 유지)
public class Ex02 {
    public static void main(String[] args) {

        // programsLangugesList == subjects
        ArrayList<String> programsLangugesList = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "python", "Go"));
        ArrayList<String> result = new ArrayList<>();
        System.out.println(programsLangugesList);


        for (int i = 0; i < programsLangugesList.size(); i++) {
            String subject =programsLangugesList.get(i);
            if (!result.contains(subject)) {
                result.add(subject);
            }
        }
        System.out.println(result);

//        ArrayList<String> result = new ArrayList<>();
//        for (int i = 0; i < programsLangugesList.size(); i++) {
//            String current = programsLangugesList.get(i);
//
//            boolean isDuplicate = false;
//
//
//            for (int j = 0; j < result.size(); j++) {
//                // equalsIgnoreCase 하나면 equals + 대소문자 처리까지 모두 해결됨/
//                //
//                if (result.get(j).equals(current)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if(!isDuplicate) {
//                result.add(current);
//            }
//        }
//        System.out.println(result);

        // 중복 제거
//        Set<String> set = new HashSet<>(programsLangugesList);
//        // 다시 리스트로 변환
//        ArrayList<String> result = new ArrayList<>(set);
//
//        System.out.println(result);
//
////      HashSet을 사용하면 순서가 보장이 안된다.



    }
}
