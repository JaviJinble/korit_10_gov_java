package study.ch14;

import java.util.Arrays;

class Student extends Object {
    private String name;
    private int score;



    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김명준", 90);
        System.out.println(student.toString());
        System.out.println(student);
        String a = student.toString(); // 자동
        System.out.println(a);
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums)); // [I@4f023edb [의 뜻은 배열이다 라는뜻 I은 타입 int 값이다
    }
}
