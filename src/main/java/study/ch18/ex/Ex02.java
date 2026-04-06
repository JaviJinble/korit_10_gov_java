package study.ch18.ex;
//### 문제 2. static 메서드 접근 제약
//
//다음 코드에서 컴파일 오류가 발생하는 줄을 모두 찾고 이유를 설명하시오.
/*
class MyClass {
    int instanceVar = 10;
    static int staticVar = 20;

    static void staticMethod() {
        System.out.println(staticVar);    // ①
        System.out.println(instanceVar);  // ②
        instanceMethod();                 // ③
        System.out.println(this);         // ④
    }

    void instanceMethod() {
        System.out.println(staticVar);    // ⑤
        staticMethod();                   // ⑤
    }
}**/// 결과  이유
// ① 정상  static -> static 접근 Ok
// ② 오류  static -> 인스턴스 필드 접근 불가
// ③ 오류  static -> 인스턴스 메서드 호출 불가
// ④ 오류  static에서 this 사용 불가(객체 없이 존재하므로)
// ⑤ 정상  인스턴스 -> static 접근 ok
// ⑤ 정상  인스턴스 -> static 메서드 호출 ok
// 답 : 2, 3, 4
public class Ex02 {
}
