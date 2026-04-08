package study.ch20.Ex;
//### 문제 17. 학생 관리 시스템
//
//List와 Map을 모두 활용하는 학생 관리 시스템을 구현하시오.
//
//- `StudentManager` 클래스
//- 내부: `Map<Integer, Student>` (학번→학생)
//- `void addStudent(int id, Student s)` — 등록
//- `Student findById(int id)` — 학번으로 조회
//- `List<Student> findByMinScore(int min)` — 점수 기준 필터
//- `double getAverage()` — 전체 평균
//- `void printAll()` — 전체 출력

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.lang.model.element.Name;
import java.util.*;

interface StudentManager {
    void addStudent(int id, String name, int score);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();
}

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
    private int score;
}

class StudentManagerImpl implements StudentManager {
    private Map<Integer, Student> studentMap;

    public StudentManagerImpl() {studentMap = new HashMap<>();} // new HashMap<>() 초기화 선언

    @Override
    public void addStudent(int id, String name, int score) {
        studentMap.put(id, new Student(id, name, score));
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id); // 학생 찾기
    }

    @Override
    public List<Student> findByMinScore(int min) { // 최저 점수 찾기 stream()은 한번 꺼내 쓰면 다시 집어 놓을수 없다
         return studentMap.values().stream()
                 .filter(student -> student.getScore() >= min)
                 .toList();
//        List<Student> findStudents = new ArrayList<>();
//        for (Student student : studentMap.values()) {
//            if(student.getScore() >= min) {
//                findStudents.add(student);
//            }
//        }
//        return findStudents;
    }

    @Override
    public double getAverage() { //  `double getAverage()` — 전체 평균

        return studentMap.values().stream()
                .map(student -> (double)student.getScore())
                .reduce(0.0, Double::sum) / studentMap.size();
//        double avg = 0;
//        for (Student student : studentMap.values()) {
//            avg += student.getScore();
//        }
//        return avg / studentMap.size();


//        if (studentMap.isEmpty()) return 0;
//
//        int sum = 0;
//
//        for (Student student : studentMap.values()) {
//            sum += student.getScore();
//        }
//
//        return (double) sum / studentMap.size();

    }

    @Override
    public void printAll() {
        studentMap.values().forEach(System.out::println);
//        studentMap.values().forEach(Student -> System.out.println(student)); 람다식으로 표현
//        for (Student student : studentMap.values()) {
//            System.out.println(student);
//        }
    }
}

public class Ex17 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManagerImpl();


        studentManager.addStudent(20260001, "김명준", 80);
        studentManager.addStudent(20260002, "김명호", 75);
        studentManager.addStudent(20260003, "김명상", 70);
        studentManager.addStudent(20260004, "김명규", 65);

        Student foundStudent = studentManager.findById(20260003);
        System.out.println(foundStudent);

        System.out.println(studentManager.findByMinScore(70));

        System.out.println(studentManager.getAverage());

        studentManager.printAll();


//        System.out.println("학번 2번 학생: " + studentManager.findById(2));
//
//        System.out.println("80점 이상 학생: ");
//        List<Student> highScore = studentManager.findByMinScore(80);
//        for (Student s : highScore) {
//            System.out.println(s);
//        }
//
//        System.out.println("전체 평균: " + studentManager.getAverage());
//
//        System.out.println("전체 학생 목록 : ");
//        studentManager.printAll();
    }
}
