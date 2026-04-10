package study.ch22;

class HomeButton implements ButtonClick { // Cltr + I 를 기억해라 오버라이딩 단축키

    @Override
    public void onClick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements ButtonClick {

    @Override
    public void onClick() {
        System.out.println("뒤로 이동");
    }
}

class LoginButton implements ButtonClick {

    @Override
    public void onClick() {
        System.out.println("로그인 요청");
    }
}

public class ButtonMain {
    public static void main(String[] args) {
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
        ButtonClick btn4 = new ButtonClick() { // 익명 클래스
            @Override
            public void onClick() { // 임프리먼트 이거 정의 할려면 인터페이스 필요
                System.out.println("로그인 요청");
            }
        };
        ButtonClick btn5 = () -> System.out.println("로그인 요청"); // () -> System.out.println("로그인 요청"); 정의하는거지 실행하는 것이 아니다. 중요. 객체 생성이다
        // 람다식의 조건 인터페이스에 추상 메서드가 딱 1개일 때만 사용 가능

        btn1.onClick();
        btn2.onClick();
        btn3.onClick();
        btn4.onClick();
        btn5.onClick();


    }
}
