package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 내부 클래스(BB가 내부 클래스)
class AA {

    @Getter
    @AllArgsConstructor
    static class BB {
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC {
        private String text;
    }

}

public class Static04 {
    public static void main(String[] args) { // Static 클래스의 특징
        AA a = new AA();
        AA.BB b = new AA.BB("이름");
        AA.CC c = (new AA()).new CC("문자열");
        AA.CC c2 = a.new CC("문자열");
        b.getName();
        c.getText();
    }
}
