package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 자료형에 대한 오버로딩 제약도 없다 빌드 패턴 즉 생성 패턴으로 하면 말이다
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
    class UserEntity {
    private String username;
    private String password;
    private String name;
    private String email;

    public static class UserBuilder {
        private String username;
        private String password;
        private String name;
        private String email;

        public UserEntity build() {
            return new UserEntity(username, password, name, email);
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this; // 자기 자신 주소 리턴
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this; // 자기 자신 주소 리턴
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this; // 자기 자신 주소 리턴
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this; // 자기 자신 주소 리턴
        }
    }


    public static UserBuilder builder() {
        return new UserBuilder();
    }

}
