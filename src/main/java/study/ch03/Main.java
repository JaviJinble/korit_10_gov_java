package study.ch03;

public class Main {
    public static void main(String[] args) {
        // 증감연산
        int a = 10;
        System.out.println(a + 10);
        a += 1;
        System.out.println(a + 10);


        int b = 10;
        System.out.println(b++ + 10);
        System.out.println(b + 10);

        int c = 10;
        c += 1;
        System.out.println(c + 10);
        System.out.println(c + 10);

        int d = 10;
        System.out.println(++d + 10);
        System.out.println(d + 10);

        int e = 100;
        System.out.println(e);
        System.out.println(++e);
        System.out.println(++e);
        System.out.println(++e);
        System.out.println(++e);
        System.out.println(e);

        int f = 1000;
        int g = f++;
        System.out.println(g);
        g = f;
        System.out.println(g);
        System.out.println(g);


        // 비교 연산자
        System.out.println(10 > 5);
        boolean status = 10 > 5;
        System.out.println(status);
        boolean status2 = 10 + 2 > 10;
        System.out.println(status2);

        int num = 100;
        boolean even = num % 10 != 0;

        boolean isNum = (num = 10) > 0;
        int test = 0;
//        while (test++ != 10) { // while ((test = test + 1) != 10)
//
//        }


//        int a = 10;
//        boolean b = (a == 10);
//        boolean c = (a = 10); a=6 b=9 c=14



    }
}
