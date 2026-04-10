package study.ch21.Ex;

//### 문제 13. 기본 사용자 정의 예외
//
//`InvalidAgeException` 클래스를 작성하시오. (RuntimeException 상속)
//
//- 필드: `int age`
//- 생성자: 메시지와 age를 받음
//- `getAge()` 메서드
//throw new InvalidAgeException("잘못된 나이", -5);

// getMessage(): "잘못된 나이"
// getAge(): -5

public class InvalidAgeException extends RuntimeException{
    // RuntimeException 상속 → unchecked 예외 (throws 안 써도 됨)
    private int age;
    // 잘못된 나이 값을 저장하기 위한 필드

    InvalidAgeException(String message, int age) {
        super(message);
        this.age = age;
    }

    int getAge() {return age; }
}
