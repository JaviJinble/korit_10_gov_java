package study.ch02;

public class Main {
    public static void main(String[] args) {

        String name  = "김명준";
        System.out.println(name);
        // 주석: 소스코드 중간 메모를 남길 때 사용(프로그램 실행시 영향을 주지 않음)
        String name2 = /*"김" + "명" + */"준" + 2;
        System.out.println(name2);
        System.out.print("김\t");
        System.out.print("명");
        System.out.print("준");
    }
}
