package ex2.view;

import ex2.router.RouterPath;
import ex2.router.Routes;
import ex2.util.Input;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)) {
            RouterPath.current = Routes.HOME.name(); // b를 눌렀을 때 HOME으로 이동 HOME.name() 이라 적는 이유는
            // enum Routes 에 있는 HOME(new HomeView()), ACCOUNT(new AccountView()), DEPOSIT(null), WITHDRAWAL(null); 이름들이 불러옴 toString()과 비슷함
            return;
        }
    }

    private void accountMenu() {
        System.out.println("==========<< ACCOUNT >>=========");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("=============================");
        System.out.println();
    }
}
