package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "김명준", "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb"); //  줄 바꿈
        UserEntity userEntity4 = userEntity.builder()
                .username("ccc")
                .password("1111")
                .name("김명준")
                .email("ccc@gmail.com")
                .build();

    }
}
