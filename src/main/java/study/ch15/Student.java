package study.ch15;

import lombok.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull // @NonNull을 사용하면 final 생략 가능 필수로 바꾸고 싶으면 @NonNull 사용
    private String name;
    @NonNull
    private int age;
    private String address;

    public Student() {
        name = "기본값";
        age = 0;
    }

}
