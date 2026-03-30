package study.ch07.ex;

public class Ex14 {
    public static void main(String[] args) {
        String grade = "B";
        switch (grade) {
            case "A": System.out.println("우수"); break;
            case "B": System.out.println("보통"); break;
            case "C": System.out.println("미흡"); break;
            default: System.out.println("등급 없음");
        }
        // 출력: 보통
        // Java 7부터 switch에 String 사용 가능. "B"에 매칭.
    }
}
