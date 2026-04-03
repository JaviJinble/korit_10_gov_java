package study.ch14.ex;

//### 문제 18. 인터페이스 타입 활용
//
//`Sortable` 인터페이스를 구현하는 `NumberSorter`와 `StringSorter`를 작성하시오.
//
//- `interface Sortable`: 메서드 `void sort()`와 `void printResult()`
//- `NumberSorter`: int 배열을 받아 오름차순 정렬
//- `StringSorter`: String 배열을 받아 알파벳순 정렬
//
//Sortable[] 배열에 담아서 sort() + printResult()를 호출하시오.

import java.util.Arrays;

interface Sortable { // 이것의 의미는 "정렬할 수 있고 결과 출력도 할 수 있어야 한다"
    void sort();
    void printResult();
}

class NumberSorter implements Sortable {
    // NumberSorter 구현 (int 정렬)
    private int[] arr;

    public NumberSorter(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        Arrays.sort(arr); // int 배열을 받아 오름차순 정렬
    }

    @Override
    public void printResult() {
        System.out.println("숫자 정렬 결과: " + Arrays.toString(arr));
    }
}

class StringSorter implements Sortable {
    private String[] arr;

    public StringSorter(String[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        Arrays.sort(arr); // 알파벳순 정렬
    }

    @Override
    public void printResult() {
        System.out.println("문자열 정렬 결과: " + Arrays.toString(arr));
    }
}

public class Ex18 {
    public static void main(String[] args) {
        Sortable[] list = new Sortable[2];


    }
}
