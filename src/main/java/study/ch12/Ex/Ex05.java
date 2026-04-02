package study.ch12.Ex;

class Printer {

    // 부모의 기본 출력 기능
    void print() {
        System.out.println("흑백 출력 중...");
    }
}

class ColorPrinter extends Printer {

    // 부모 메서드를 확장
    @Override
    void print() {
        super.print();  // 부모의 print() 먼저 실행
        System.out.println("컬러 변환 완료!");
    }
}

public class Ex05 {
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.print();
    }
}
