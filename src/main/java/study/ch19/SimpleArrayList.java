package study.ch19;


import lombok.Getter;

import java.util.Arrays;

public class SimpleArrayList {
    @Getter
    private String[] strs;

    public SimpleArrayList() {
        strs = new String[0];
    }

    public void add(String str) { // 이것이 add다. 배열에 추가하는 로직이다
        String[] newStrs = new String[strs.length + 1];
        for(int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;
    }

    // 크기를 넘어서는 인덱스 위치에 추가는 불가능
    public void add (int index, String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            int currentIndex = i < index ? i : i + 1; // 코드를 이렇게 작성하는 이유는 가독성을 높히기 위해
            newStrs[currentIndex] = strs[i];
        }
        newStrs[index] = str;
        strs = newStrs;

//        // 유효성 검사
//        if (index < 0 || index > strs.length) {
//            return;
//        }
//        String[] newStrs = new String[strs.length + 1]; // 배열 크기 증가
//
//        // 앞쪽 복사
//        for(int i = 0; i < index; i++) {
//            newStrs[i] = strs[i];
//        }
//
//        // 삽입
//        newStrs[index] =str;
//
//        // 뒤쪽 밀기
//        for (int i = index; i < strs.length; i++) {
//            newStrs[i + 1] = strs[i];
//        }
//        this.strs = newStrs; // 참조 교체

    }

// pop()은 반대로:
//기존 배열보다 1칸 작은 배열 생성
//마지막 값은 버리고
//앞부분만 복사
//strs를 새 배열로 교체
    public void pop() {
        if (strs.length < 1){
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for(int i = 0; i < newStrs.length; i++) { // 기존 배열 전체를 다 돌 필요가 없음.
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
    }

    public void remove(int index) {
        if (strs.length < 1){
            return;
        }

        String[] newStrs = new String[strs.length - 1]; // 삭제는 반드시 - 1
        for (int i = 0; i < newStrs.length; i++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[i] = strs[currentIndex];
        }
//        for (int i = 0; i < strs.length; i++) {
//            if (i < index) {
//                newStrs[i] = strs[i];
//            }else if (i > index) {
//                newStrs[i - 1] = strs[i];
//            }
//            // i == index -> 건너뜀 (삭제)
//        }
        this.strs = newStrs;
    }

    public void remove(String str) {
        if (strs.length < 1){
            return;
        }
        int foundIndex = -1;
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            return;
        }
        remove(foundIndex);


    }
}

class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("김명준");
        list.add("김명규");
        list.add(0, "김민성");
        list.add("메카모찌");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));
        list.add("test");
        list.add("test");
        list.add("test");
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove(4);
        System.out.println(Arrays.toString(list.getStrs()));
        list.remove("test");
        System.out.println(Arrays.toString(list.getStrs()));
    }
}