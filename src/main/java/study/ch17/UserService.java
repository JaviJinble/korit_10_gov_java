package study.ch17;


public class UserService {
    private UserRepository userRepository; // 매개변수를 넘겨줘야한다
    // 초기값으로 들어간다
    public UserService(UserRepository userRepository) { // 의존성을 생성될 때, 받아오겠다
        this.userRepository = userRepository;
    }

    public int signup(String username, String password) {
        // 성공: 200, 실패: 400(중복 아이디), 500(공간부족)
        //UserRepository userRepository = new UserRepository();
        User foundUser = userRepository.findByUsername(username);
        // UserService를 userRepository가 의존하고 있다
        if (foundUser != null) {
            return 400;
        }

//        User newUser = new User(0L, username, password);
        User newUser = User.builder()
                .username(username)
                .password(password)
                .build();
        boolean isSuccess = userRepository.addUser(newUser);
        if (!isSuccess) {
            return 500;
        }

        userRepository.printUsers();
        return 200;
    }
}
