package study.ch07.ex;

public class Ex04 {
    public static void main(String[] args) {
        //문제4
        int score = 95;
        if (score >= 60) {
            System.out.println("D");
        }else if (score >= 70) {
            System.out.println("C");
        }else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 90) {
            System.out.println("A");
        }

        // 출력 값: D
        //이유는 if(score >= 60) 은 항상true값이 나와 "D"를 출력한다
    }
}
