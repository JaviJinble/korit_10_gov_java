package ex3.view;

import ex3.router.Routes;
import ex3.router.RouterPath;
import ex3.util.Input;
import ex3.controller.Controller;
import ex3.model.Account;

public class WithdrawView implements View{
    @Override
    public void render() {
        try {
            System.out.println("====== < 출금 > ======");

            System.out.print("계좌번호 입력: ");
            int accountNo = Integer.parseInt(Input.nextLine());

            System.out.print("출금액 입력: ");
            int amount = Integer.parseInt(Input.nextLine());

            Controller.service.withdraw(accountNo, amount);

            Account account = Controller.service.findByNo(accountNo);

            System.out.println("====== < 출금 완료 > ======");
            System.out.println("계좌번호: " + account.getAccountNo());
            System.out.println("예금주: " + account.getOwner());
            System.out.println("현재 잔액: " + account.getBalance());
            System.out.println("==========================");
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("숫자를 올바르게 입력하세요.");
        } catch (RuntimeException e) {
            System.out.println("오류: " + e.getMessage());
        }

        RouterPath.current = Routes.HOME.name();
    }

}
