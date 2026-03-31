package study.ch08;

public class OBJ03 {
    public static void main(String[] args) {
        class Student {
            String name;
            int age;

            Student(String a, int b) {
                System.out.println("학생 생성");
                this.name = a;
                this.age = b;
            }
        }

        // Student s1 = new Student();
        Student s1 = new Student("김명준", 29);
        Student s2 = new Student("김명규", 28);
    }
}
