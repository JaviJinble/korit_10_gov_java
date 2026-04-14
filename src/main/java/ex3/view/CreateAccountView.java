package ex3.view;

import ex3.controller.Controller;
import ex3.model.Account;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.util.Input;

public class CreateAccountView implements View{
    @Override
    public void render() {
        try {
            createAccontMenu();

            System.out.print("이름 입력: ");
            String owner = Input.nextLine();

            System.out.print("초기 잔액 입력: ");
            int balance = Integer.parseInt(Input.nextLine());

            Account account = Controller.service.createAccount(owner, balance);

            System.out.println("====== < 계좌 생성 완료 > ======");
            System.out.println("계좌번호: " + account.getAccountNo());
            System.out.println("예금주: " + account.getOwner());
            System.out.println("잔액: " + account.getBalance());
            System.out.println("==============================");
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("숫자를 올바르게 입력하세요.");
            System.out.println();
        } catch (RuntimeException e) {
            System.out.println("오류: " + e.getMessage());
            System.out.println();
        }

        RouterPath.current = Routes.HOME.name();
    }

    private void createAccontMenu() {
        System.out.println("===== <계좌 생성> =====");
    }
}
