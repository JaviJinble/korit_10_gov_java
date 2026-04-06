package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}


public class Wildcard {
    // ? extends Object 한거와 같다
    public static void print(SuccessResponse<?> sr) {
        System.out.println(sr);
    }


    // 상한 제한 와일드카드
    public static void print2(SuccessResponse<? extends Student> sr) {
        // extends Student 하위 객체만 가능 상한선을 정했다
        System.out.println(sr);
    }

    // 하한 제한 와일드카드
    public static void print3(SuccessResponse<? super Student> sr) {
        // 오버로딩은 안된다. super Student의 뜻은 상위 객체만 즉 하위객체는 안된다, // 하한선을 정했다
        System.out.println(sr);

    }


    public static void main(String[] args) {
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(201, "그냥 문자열");
//        SuccessResponse<?> sr1 = new SuccessResponse<>(200, User.builder().build());
//        SuccessResponse<?> sr2 = new SuccessResponse<>(201, "그냥 문자열");
        // 다운캐스팅을 해야해서 단점

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//        Wildcard.print2(new SuccessResponse<Person>(200, new Person())); // 상한 제약 걸림
        Wildcard.print2(new SuccessResponse<Student>(200, new Student()));

        Wildcard.print3(new SuccessResponse<Student>(201, new Student()));
//        Wildcard.print3(new SuccessResponse<HighStudent>(201, new HighStudent())); // 하한 제약 걸림
    }
}
