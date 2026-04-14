package ex3.view;

import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;
import ex3.controller.Controller;
import ex3.model.Account;

public class FindAccountView implements View{
    @Override
    public void render() {
        try {
            System.out.println("====== < 계좌 조회 > ======");

            System.out.print("계좌번호 입력: ");
            int accountNo = Integer.parseInt(Input.nextLine());

            Account account = Controller.service.findByNo(accountNo);

            if (account == null) {
                System.out.println("존재하지 않는 계좌입니다.");
            } else {
                System.out.println("계좌번호: " + account.getAccountNo());
                System.out.println("예금주: " + account.getOwner());
                System.out.println("잔액: " + account.getBalance());
            }

            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        }

        RouterPath.current = Routes.HOME.name();
    }
}
