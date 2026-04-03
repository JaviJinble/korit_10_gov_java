package study.ch12.Ex;

class Student1 {
    String name;
    int age;
    double gpa;

    Student1(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // 객체를 출력할 때 원하는 문자열 형태로 바꾸기 위해 오버라이딩
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}

public class Ex07 {
    public static void main(String[] args) {
        Student1 s = new Student1("김자바", 20, 3.8);

        // System.out.println(객체) 하면 자동으로 toString()이 호출됨
        System.out.println(s);
    }
}