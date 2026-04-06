package study.ch17;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@NoArgsConstructor // 내가 @NoArgsConstructor를 사용할꺼면 @AllArgsConstructor따로 추가해라
//@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
}
