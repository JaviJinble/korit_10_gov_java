package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

// ### 문제 1. 학생 성적 관리
//ArrayList를 사용하여 5명의 학생 점수를 저장하고, 평균과 최고 점수를 구하시오.

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> scoresList = new ArrayList<>(List.of(85, 95, 78, 96, 88));

        int total = 0;
        int max = scoresList.get(0); // 첫번째 값을 max에 넣어두겠다

        for (Integer score : scoresList) {
            total += score;

            if (score > max) {
                max = score;
            }
        }

        double avg = (double) total / scoresList.size();

        System.out.println("전체 점수 :" + scoresList);
        System.out.println("평균 :" + avg);
        System.out.println("최고 점수 :" + max);

    }
}
