package study.ch05;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        boolean result = num % 2 == 0; // 짝수

//        if (result) System.out.println(num * 10);
//        if (!result) System.out.println(num * 20);

        if (result) {
            System.out.println(num * 10);
            System.out.println("짝수");
        } else {
            System.out.println(num * 20);
            System.out.println("홀수");
        }

        // num의 값이 짝수 -> num에 10을 곱하고 짝수가 아니면 20을 곱하여 결과를 콘솔에 출력하라

        int num2 = 12;

        if (num2 % 8 == 0) {
            System.out.println("8의 배수 입니다.");
        } else if (num2 % 7 == 0) {
            System.out.println("7의 배수 입니다.");
        } else if (num2 % 6 == 0) {
            System.out.println("6의 배수 입니다.");
        } else {
            System.out.println("8, 7, 6의 배수가 아닙니다.");
        }
/////---------------////

        int ki = 140;
        int age = 7;

        if (age >= 7) {
            System.out.println("7세 이상입니다");
            if (ki >= 140){
                System.out.println("140cm 이상입니다");
            } else {
                System.out.println("탑승 가능입니다");
            }
        } else {
            System.out.println("탑승 불가능입니다");
        }

        if (age >= 7 && ki >= 140) {
            System.out.println("탑승 가능합니다");
        } else if (age >= 7) {
            System.out.println("나이가 7세 이상이어야합니다");
            System.out.println("탑승 불가능합니다");
        } else {
            System.out.println("키가 140cm 입니다");
            System.out.println("탑승 불가능합니다");
        }


    }
}
