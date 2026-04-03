package study.ch15;


public class Main {
    public static void main(String[] args) {
        Student student = new Student();  // 기본 생성자 가능 (NoArgsConstructor 있음)
        //Student.student = new Student();
//        student.setName("김명준");
//        student.setAge(29);
        student.setAddress("부산남구");
        System.out.println(student);
        System.out.println(student);

        Student student2 = new Student("김명준", 29, "남구");
        System.out.println(student2);

        final String data = "임시 데이터"; // final 상수
        // data = "test"; 상수는 한번 초기화 후 변경 할 수 없다.
        System.out.println(data);

        final String data2; // 상수 선언
        data2 = "test"; // 초기화

        Student student3 = new Student("김명준", 29);

    }
}
