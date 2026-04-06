package study.ch18.ex;

class Student {
    String name;
    int id;
    private static int nextId = 1;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    static int getStudentCount() {
        return nextId - 1;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student("김");  // id=1
        Student s2 = new Student("이");  // id=2
        Student s3 = new Student("박");  // id=3
        System.out.println(Student.getStudentCount()); // 3
    }
}
