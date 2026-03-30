package study.ch07.ex;

public class Ex40 {
    public static void main(String[] args) {
        // 빈칸 채우기
        // 다음 코드가 주석의 결과대로 동작하도록 빈칸 ⓐ ~ ⓕ를 채우시오.


        // 1~100 중 짝수의 합 구하기
        //int sum = 0;
        //for (int i =  ⓐ ; i <=  ⓑ ; i++) {
        //    if (i %  ⓒ  != 0) {
        //         ⓓ ;   // 홀수는 건너뛰기
        //    }
        //    sum  ⓔ  i;
        //}
        //System.out.println(sum); // 출력:  ⓕ
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum); // 2550
        //ⓐ	1	1부터 시작
        //ⓑ	100	100까지 반복
        //ⓒ	2	2로 나눈 나머지로 짝홀 판별
        //ⓓ	continue	홀수는 건너뛰기
        //ⓔ	+=	누적 덧셈
        //ⓕ	2550	2+4+6+...+100 = 2550
    }
}
