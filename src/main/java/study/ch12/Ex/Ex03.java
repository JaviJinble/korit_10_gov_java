package study.ch12.Ex;

class Person {
    String name;  // 사람 이름

    Person(String name) {
        this.name = name;
        System.out.println("Person 생성자: " + name);
    }
}

class Student extends Person {
    String major;  // 전공

    Student(String name, String major) {
        super(name);  // Person 생성자 먼저 호출
        this.major = major;
        System.out.println("Student 생성자: " + major);
    }
}

class GradStudent extends Student {
    String research;  // 연구 분야

    GradStudent(String name, String major, String research) {
        super(name, major);  // Student 생성자 먼저 호출
        this.research = research;
        System.out.println("GradStudent 생성자: " + research);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent("김자바", "컴퓨터공학", "인공지능");
    }
}
