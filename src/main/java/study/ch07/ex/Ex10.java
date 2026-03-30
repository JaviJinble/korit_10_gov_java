package study.ch07.ex;

public class Ex10 {
    public static void main(String[] args) {
        // 다음 조건에 맞는 else if 코드를 작성하시오.
        double bmi = 22.5;
        if (bmi < 18.5) {
            System.out.println("저체중");
        }else if (bmi < 25.0) {
            System.out.println("정상");
        }else if (bmi < 30.0) {
            System.out.println("과체중");
        }else {
            System.out.println("비만");
        }
        // 출력: "정상"

    }
}
