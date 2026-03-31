package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /**
         *  100명의 학생정보를 저장하세요
         *  이름, 나이, 학년, 주소, 연락처
         *
         */
        class Student {
            String name;
            int age;

            Student() {
                System.out.println("학생 한명 생성\n");
            }

            void printInfo() {
                System.out.println("name: " + name);
                System.out.println("age: " + age);
            }

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                age++;
            }
        }

        Student student1 = new Student();
        student1.name = "김명준";
        student1.age = 29;
        student1.printInfo();
        student1.increaseAge();
        student1.printInfo();
        student1.printInfo();

        System.out.println();

        Student student2 = new Student();
        student2.name = "김명규";
        student2.age = 29;
        student2.printInfo();
        student2.increaseAge();
        student2.printInfo();


    }
}
