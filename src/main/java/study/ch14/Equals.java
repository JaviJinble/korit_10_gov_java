package study.ch14;

import java.util.Objects;

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) { // 패키지 클래스명
//        if (!(o instanceof Teacher)){
//            return false;
//        }
//        Teacher teacher = (Teacher) o; // 다운 캐스팅
//        return this.age == teacher.age && this.name.equals(teacher.name);
//
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher teacher)) return false; // o instanceof Teacher teacher 자동 다운캐스팅
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Equals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김명준", 29);
        Teacher teacher2 = new Teacher("김명준", 29);

        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1 == teacher2);
    }
}
