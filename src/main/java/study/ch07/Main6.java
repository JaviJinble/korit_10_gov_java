package study.ch07;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int searchNumber = 16;
        int foundIndex = -1;
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            if(num == searchNumber) {
                foundIndex = i;
                break; // 자원낭비를 줄이기 위해서 원하는 정보를 찾으면 break;를 걸어 반복을 멈춘다
                       // 지금은 반복 횟수가 10이라 적지만 그 수가 커지면 쓸데없는 반복을 자원낭비가 된다
            }
        }

        // 찾지 못하면 Index에서는 -1로 표현
        System.out.println("검색 번호: " + searchNumber);
        System.out.println("찾은 Index: " + foundIndex);

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("프로그램을 종료하시려면 close를 입력해주세요(계속 사용하시려면 아무키나 입력 후 엔터): ");
            if (sc.nextLine().equals("close")) {
                break;
            }
            System.out.println("프로그램 실행 중...");
        }



    }
}
