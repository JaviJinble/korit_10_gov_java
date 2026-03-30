package study.ch07.ex;

public class Ex15 {
    public static void main(String[] args) {
        // 다음 switch 문을 if-else if 문으로 변환하시오.
//        int season = 3;
//        switch (season) {
//            case 1: System.out.println("봄"); break;
//            case 2: System.out.println("여름"); break;
//            case 3: System.out.println("가을"); break;
//            case 4: System.out.println("겨울"); break;
//            default: System.out.println("잘못된 입력");
//        }
        // 정답
        int season = 3;
        if (season == 1) {
            System.out.println("봄");
        } else if (season == 2) {
            System.out.println("여름");
        } else if (season == 3) {
            System.out.println("가을");
        } else if (season == 4) {
            System.out.println("겨울");
        } else {
            System.out.println("잘못된 입력");
        }
    }
}
