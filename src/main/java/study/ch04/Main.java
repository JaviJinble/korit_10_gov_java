package study.ch04;

public class Main {
    public static void main(String[] args) {
        String name1  = "김명준";
        String name2  = "김명준";
        String name3 = new String("김명준");

        boolean result1 = name1 == name2;
        boolean result2 = name1.equals(name3);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3.toString());

        System.out.println(name1 + name2 + name3);

        System.out.println(result1);
        System.out.println(result2);

    }
}
