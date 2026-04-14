package ex3.view;

import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class AccountView implements View {
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();

        if ("1".equals(cmd)) {
            RouterPath.current = Routes.CREATE_ACCOUNT.name();
        } else if ("b".equals(cmd)) {
            RouterPath.current = Routes.HOME.name();
        } else {
            System.out.println("잘못된 입력입니다.");
            System.out.println();
        }
    }

    private void accountMenu() {
        System.out.println("=======<< ACCOUNT >>=======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("===========================");
        System.out.println();
    }
}
