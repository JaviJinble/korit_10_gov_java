package study.ch16;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schoolName;

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName; // 변수명이 같아짐;;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static Student getNewStudent(String name) { //getInstance
        // this.name = name;
        Student student = new Student();
        student.setName(name);
        return student; // 학생 객체를 즉 return 은 자료형이 맞으면 return 가능하다
    }

}

public class Static01 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("김명준");

        Student.setSchoolName("신라대학교");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("김명준");
        System.out.println(student);


        Student student2 = Student.getNewStudent("김명규");

    }
}
