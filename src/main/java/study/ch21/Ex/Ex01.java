package study.ch21.Ex;

/**### 문제 1. 기본 try-catch

 다음 코드에서 예외가 발생하지 않도록 try-catch로 감싸시오.
 예외 발생 시 "오류가 발생했습니다: (메시지)"를 출력하고,
 예외 여부와 상관없이 "프로그램 종료"를 출력하시오.

*/

public class Ex01 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
            System.out.println("정상 실행");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류가 발생했습니다: " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
