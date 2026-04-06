package study.ch18;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessResponse<T> { // 제네릭은 클래스나 메서드에서 타입을 변수처럼 사용하는 것
    private int code;
    private T body;
}
