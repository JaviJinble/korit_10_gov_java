package study.ch07.ex;

public class Ex25 {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + "은(는) " + (isPrime ? "소수" : "소수 아님"));
        //**출력:** `13은(는) 소수`
        //
        //13을 2~12로 나누어 떨어지는 수가 없으므로 `isPrime`은 true 유지.
    }
}
