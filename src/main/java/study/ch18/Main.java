package study.ch18;

import study.ch17.User;

public class Main {
    public static void main(String[] args) { // 제네릭은 클래스나 메서드에서 타입을 변수처럼 사용하는 것
        // 제네릭을 하는 이유는 일일히 다운캐스팅을 안할려고 하는 것이다
        ErrorResponse er = new ErrorResponse(400, User.builder().build());
        User user = (User) er.getBody();
        System.out.println(user.getUsername());
        System.out.println(((User) er.getBody()).getUsername());

        SuccessResponse<User> sr = new SuccessResponse<User>(200, User.builder().build());
        User user2 =  sr.getBody();
        System.out.println(user2.getUsername());

        ErrorResponse.print(User.builder().username("test").password("1234").build());
        ErrorResponse.print(10);
        ErrorResponse.print("문자열데이터");

        String result = ErrorResponse.print2(10, "반환 데이터");
        System.out.println(result);

        SuccessResponse<String> sr2 = new SuccessResponse<>(200, "성공");
        SuccessResponse<Integer> sr3 = new SuccessResponse<>(200, 100000); // boxing
        Integer i = sr3.getBody();
        SuccessResponse<Double> sr4 = new SuccessResponse<>(200, 100000.0);
        SuccessResponse<Character> sr5 = new SuccessResponse<>(200, 'a');
        SuccessResponse<Boolean> sr6 = new SuccessResponse<>(200, true);
    }
}
