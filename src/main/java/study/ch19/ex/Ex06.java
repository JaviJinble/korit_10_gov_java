package study.ch19.ex;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Student {
    private String name;
    private int studentYear;
    private int korScore;
    private int engScore;
    private int mathScore;
}

public class Ex06 {
    public static void main(String[] args) {

        int currentStudentCode = 20260000;

        List<Student> studentList = List.of(
                Student.builder().name("김명준").studentYear(1).korScore(80).engScore(90).mathScore(100).build(),
                Student.builder().name("김명중").studentYear(2).korScore(70).engScore(80).mathScore(80).build(),
                Student.builder().name("김명규").studentYear(1).korScore(90).engScore(80).mathScore(70).build(),
                Student.builder().name("김민성").studentYear(2).korScore(60).engScore(70).mathScore(80).build()
        );


        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        ); // Map을 사용해 key 값 부여함

        // 1학년 2학년을 학년을 비교해 자신 학년에 맞는 List에 채워넣기
        for (Student student : studentList ) {
            // student에 studentList만큼 반복한다
            studentMap.get(student.getStudentYear()).add(student);
            // 이 코드가 뭘 의미하는지 스스로 해석하기
            // studentMap.get (key = Integer) 왜? 위에서 정했으니,
            //  studentMap.get(student.getStudentYear())를 new ArrayList<>()가져오는 것이고 마지막에 추가한다 add(student)
        }

        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        ));
        // 학년 마다 과목별 평균을 구하시오
        // 평균을 구하려는 Map 구성

        for (Student student : studentList) {
            scoreMap.replace("korScore", scoreMap.get("korScore") + student.getKorScore());
            scoreMap.replace("engScore", scoreMap.get("engScore") + student.getEngScore());
            scoreMap.replace("mathScore", scoreMap.get("mathScore") + student.getMathScore());
        } // put 써도 됨 put 은 똑같은 키가 있으면 마지막에 덮어쒸운다
        // replace는 해당키가 존재해야 수정한다 put은 해당 키가 없으면 생성해 추가한다

        for (String key : scoreMap.keySet()) {
            scoreMap.put(key, scoreMap.get(key) / studentList.size());
        }
        System.out.println(scoreMap);


        Map<String, Integer> totalScoreMap = new HashMap<>();
        // 학생이름별로 총점 구하기 학생이름이 key값 총점이 velue값
        for (Student student : studentList) {
            totalScoreMap.put(student.getName(), student.getKorScore() + student.getEngScore() + student.getMathScore());
//            int total = student.getKorScore()
//                      + student.getEngScore()
//                      + student.getMathScore();

        }
        System.out.println(totalScoreMap);


//        for (Map.Entry<Integer, List<Student>> entry : studentMap.entrySet()) {
//            int year = entry.getKey(); // 학년
//            List<Student> students = entry.getValue(); // 해당 학년 학생들
//
//            Map<String, Double> scoreMap = new HashMap<>(Map.of(
//                    "korScore", 0.0,
//                    "engScore", 0.0,
//                    "mathScore", 0.0
//            ));
//            // 학년 마다 과목별 평균을 구하시오
//
////            int korSum = 0;
////            int engSum = 0;
////            int mathSum = 0;
//
////            for (Student student : students) {
////                scoreMap.put("korScore", scoreMap.get("korScore") + student.getKorScore());
////                scoreMap.put("engScore", scoreMap.get("engScore") + student.getEngScore());
////                scoreMap.put("mathScore", scoreMap.get("mathScore") + student.getMathScore());
////            }
////            scoreMap.put("korScore", scoreMap.get("korScore") / students.size());
////            scoreMap.put("engScore", scoreMap.get("engScore") / students.size());
////            scoreMap.put("mathScore", scoreMap.get("mathScore") / students.size());
//
//            for (String key : scoreMap.keySet()) {
//                scoreMap.replace(key, scoreMap.get(key) / studentList.size());
//            }
//            System.out.println(scoreMap);
////            System.out.println(year + "학년 평균: " + scoreMap);
//        }

    }
}
