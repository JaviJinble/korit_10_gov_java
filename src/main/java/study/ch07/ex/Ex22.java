package study.ch07.ex;

public class Ex22 {
    public static void main(String[] args) {
        // 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 출력 결과
        //*
        //**
        //***
        //****
        //*****

    }
}
