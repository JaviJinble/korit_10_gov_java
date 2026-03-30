package study.ch07;

public class Main {
    public static void main(String[] args) {

        System.out.println("프로그램 실행1.");
        int input1 = 10;
        int input2 = 5;




        for (int i = 0; i < 5; i++) {
            System.out.println( 5-i );
            for (int j = 0; j < 3; j++) {
                if (j ==0) {
                    System.out.println((5 - i) * 10);
                }else if(j == 1) {
                    System.out.println((5 - i) * 100);
                }else {
                    System.out.println((5 - i) * 1000);
                }
            }
        }

        System.out.println("프로그램 종료1.");

        System.out.println("프로그램 종료2.");
        for (int i = 5; i > 0; i--) {
            System.out.println( i );
        }

        System.out.println("프로그램 종료2.");


        System.out.println("프로그램 실행3.");
        for (int i = 0; i < 5; i++) {
            System.out.println( 5-i );
            for (int j = 0; j < 3; j++) {

                int num = 1;
                for(int k = 0; k < j + 1; k++){
                    num *= 10;
                }
                System.out.println((5 - i) * num);

            }
        }

        System.out.println("프로그램 종료3.");


    }
}
