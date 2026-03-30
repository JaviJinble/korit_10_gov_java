package study.ch07.ex;

public class Ex13 {
    public static void main(String[] args) {
        // day 값(1~7)에 따라 요일을 출력하는 switch 코드를 작성하시오. (1=월, 2=화, ..., 7=일)
        int day = 5;
        // 여기에 switch 코드를 작성하시오.
        switch (day) {
            case 1: System.out.println("월요일"); break;
            case 2: System.out.println("화요일"); break;
            case 3: System.out.println("수요일"); break;
            case 4: System.out.println("목요일"); break;
            case 5: System.out.println("금요일"); break;
            case 6: System.out.println("토요일"); break;
            case 7: System.out.println("일요일"); break;
            default: System.out.println("잘못된 입력");
        }
        // 출력: "금요일"
    }
}
