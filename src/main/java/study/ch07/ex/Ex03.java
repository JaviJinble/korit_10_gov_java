package study.ch07.ex;

public class Ex03 {
    public static void main(String[] args) {
        //문제3
        int score = 72;
        if (score >= 90) {
            System.out.println("A");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70) {
            System.out.println("C");
        }else {
            System.out.println("F");
        }
        //출력 값: C
    }
}
