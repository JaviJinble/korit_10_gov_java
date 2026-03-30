package study.ch07;

public class Main3 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            count++;
            System.out.println(count);
        }
/*
* for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
* */
        int num = 5;
        int i = 0;
        while (i < num) {

            int j = 0;
            int k = 0;
            while (j < num - 1 - i) {
                System.out.print(" ");
                j++;
            }
            while (k < i + 1) {
                System.out.print("*");
                k++;
            }
            System.out.println(); // 줄 바꿈
            i++;
        }


    }
}
