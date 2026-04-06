package study.ch18.ex;

class Counter {
    static int count = 0;
    String name;

    Counter(String name) {
        this.name = name;
        count++;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        Counter c3 = new Counter("C");
        System.out.println(Counter.count);
        System.out.println(c1.count);
    }
}
// static 필드 count는 모든 객체가 공유.
// 3번 생성 → count=3. c1.count도 Counter.count와 동일
// (인스턴스로도 접근 가능하지만 권장하지 않음).
// 출력 결과 :
// 3
// 3