package study.ch09.entity;

public class User {
    private String username;
    private String password;
    private String name;

    public User(String username, String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public User(String username, String password) {
        this(username, password, "공백");
    }

    public User(String username) {
        this(username, "1234", "공백");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name.substring(0, name.length() - 1);
        // 김명준님 - 문자 길이 4
        // 0 1 2 3
    }

    public void setName(String name) {
        this.name = name + "님";
    }
}
