package study.ch21.Ex;

/**
 * ### 문제 2. 숫자 변환 예외
 *
 * 사용자로부터 문자열을 받아 정수로 변환하는 코드를 작성하시오. 변환 실패 시 "숫자가 아닙니다"를 출력하시오.
 */
public class Ex02 {
    public static void main(String[] args) {
        String input = "abc123";

        try {
            int num = Integer.parseInt(input);
            System.out.println("변환 결과: " + num);
            // NumberFormatException 처리
            // 출력: "숫자가 아닙니다: abc123"
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다: " + input);;
        }
    }
}
