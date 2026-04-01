package study.ch10;

import study.ch10.entity.Student;

public class Array09 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("김명준", 80);
        students[1] = new Student("김명규", 90);
        students[2] = new Student("김민성", 100);

        for (int i = 0; i < students.length; i ++) {
            System.out.println(students[i].toString());
        }

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            students[i].setScore(students[i].getScore() - 5);
            //students[i].getScore(students[i].getScore() - 5);
        }
        /**
         * for (int i = 0; i < students.length; i++) {
         *     students[i].setScore(students[i].getScore() - 5);
         * }
         * */

        for (Student student : students) {
            student.setScore(student.getScore() - 5);
        }

        for (Student student : students) {
            System.out.println(students.toString());
        }

        String searchName = "김명규";
        Student foundStudent = null; // null은 객체에 사용

        for (int i = 0; i < students.length; i++) {
            if (searchName.equals(students[i].getName())) {
                foundStudent = students[i];
                break;
            }
        }
        if (foundStudent == null) {
            System.out.println("해당 이름의 학생이 존재하지 않습니다.");
            return; // 함수의 결과 리턴 즉 main함수 리턴 void 함수 리턴
        }

        System.out.println("[ 찾은 학생 정보 ]");
        System.out.println("이름: " + foundStudent.getName());
        System.out.println("점수: " + foundStudent.getScore());

    }
}
