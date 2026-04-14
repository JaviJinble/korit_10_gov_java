package ex3.view;
import ex3.model.Account;
import java.util.List;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.controller.Controller;

public class AccountListView implements View {
    @Override
    public void render() {
        System.out.println("====== < 계좌 목록 > ======");

        List<Account> accounts = Controller.service.getAccountList();

        if (accounts.isEmpty()) {
            System.out.println("등록된 계좌가 없습니다.");
        } else {
            for (Account account : accounts) {
                System.out.println(account);
            }
        }

        System.out.println("==========================");
        System.out.println();

        RouterPath.current = Routes.HOME.name();
    }
}
