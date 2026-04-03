package study.ch14.ex;

//다음 인터페이스와 클래스를 작성하시오.
//
//- `interface Printable`: 메서드 `void print()`
//- `interface Scannable`: 메서드 `void scan()`
//- `interface Faxable`: 메서드 `void fax()`
//- `class AllInOnePrinter implements Printable, Scannable, Faxable`: 3개 모두 구현

interface Printable { void print(); } // 출력 기능이 있어야 한다
interface Scannable { void scan(); }
interface Faxable { void fax(); }

class AllInOnePrinter implements Printable, Scannable, Faxable {
    // 다중 구현
    // 자바는 클래스는 단일 상속 인터페이스는 다중 구현 가능 implements

    @Override
    public void fax() {
        System.out.println("팩스 전송 중 ...");
    }

    @Override
    public void print() {
        System.out.println("출력 중 ...");
    }

    @Override
    public void scan() {
        System.out.println("스캔 중 ...");
    }
}
//인터페이스는 왜 쓰냐?
//
//"이 기능을 반드시 구현해라" 강제
// 시험 포인트 (정처기)
// 인터페이스는 다중 구현이 가능하며,
// 구현 클래스는 모든 추상 메서드를 반드시 구현해야 한다
// 자주 틀리는 부분 -> implements 하나만 쓰는 거 아님
// 인터페이스 = 기능 약속 / implements = 그 약속을 지키는 것

public class Ex17 {
    public static void main(String[] args) {
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();

        allInOnePrinter.print();
        allInOnePrinter.scan();
        allInOnePrinter.fax();
    }
}
