package study.ch07;

public class Star {
    public static void main(String[] args) {
        int count = 5;

        /**
         *
         * *
         * **
         * ***
         * ****
         * *****
         *
         */
        /*


         */

//        for (int i = 0; i < 5; i++) {
//            // i가 5번 반복을 실행.
//            // i++ i는 1씩 증가 따라서 i가 5보다 작은 4까지만 0~4까지 실행
//            // for j 반복문 안 반복으로 *이 출력된다
//             for(int j = 0;j < i + 1; j++) {
//                 System.out.print("*");
//             } // 여기서 *이 출력된다.
//            System.out.println(); // 줄 바꿈
//        }

        for (int i = 0; i <count ; i++) {

            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }



    }
}
