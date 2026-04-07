package study.ch18.ex;
//### 문제 16. Eager vs Lazy 싱글톤
//다음 두 구현의 차이를 설명하시오.

// 방식 A: Eager(즉시 로딩)
class SingletonA {
    private static final SingletonA INSTANCE = new SingletonA();
    private SingletonA() { }
    public static SingletonA getInstance() { return INSTANCE; }
}
// Eager 생성 시점 : 클래스 로딩 시
// 메모리 : 비효율 가능
// Eager = 안전하지만 낭비


// 방식 B: Lazy(지연로딩)
class SingletonB {
    private static SingletonB instance;
    private SingletonB() { }
    public static SingletonB getInstance() {
        if (instance == null) instance = new SingletonB();
        return instance;
    }
}
// Lazy 생성 시점 : 호출 시
// 메모리 : 효율적
//Lazy = 효율적이지만 동기화 필요

public class Ex16 {
}
