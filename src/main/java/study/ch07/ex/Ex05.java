package study.ch07.ex;

public class Ex05 {
    public static void main(String[] args) {
        //문제5
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("운전 가능");
        }else {
            System.out.println("운전 불가");
        }

        // 출력값: 운전 가능
    }
}
