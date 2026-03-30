package study.ch07.ex;

public class Ex09 {
    public static void main(String[] args) {
        //switch ()문제
        int month = 7;

        if (month >= 3 && month <= 5) { // AND연산자가 나왔으니 앞이 true면 뒤는 볼 필요도 없이
            // true
            // 3~5월: 봄
            System.out.println("봄");
        }else if (month >= 6 && month <= 8) {
            // 6~8월: 여름
            System.out.println("여름");
        }else if (month >= 9 && month <= 11) {
            // 9~11월: 가을
            System.out.println(("가을"));
        }else {
            // 여기 코드에서는 그렇지 않은 수 인가?
            // 1년은 12개월 즉, 12가 고정이다. 따라서 12값 보다 높은 수가 나올 수 가 없다.
            System.out.println("겨울");
        }

//        if (month >= 3 && month <= 5) {
//            System.out.println("봄");
//        } else if (month >= 6 && month <= 8) {
//            System.out.println("여름");
//        } else if (month >= 9 && month <= 11) {
//            System.out.println("가을");
//        } else {
//            System.out.println("겨울");
//        }
        // 출력: "여름"
    }
}
