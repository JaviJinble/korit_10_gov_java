package ex3.view;

import ex3.controller.Controller;
import ex3.model.Transaction;
import ex3.router.RouterPath;
import ex3.router.Routes;
import java.util.List;

public class HistoryView implements View{
    @Override
    public void render() {
        System.out.println("====== < 거래 내역 > ======");

        List<Transaction> history = Controller.service.getHistory();

        if (history.isEmpty()) {
            System.out.println("거래 내역이 없습니다.");
        } else {
            for (Transaction t : history) {
                System.out.println(t);
            }
        }

        System.out.println("==========================");
        System.out.println();

        RouterPath.current = Routes.HOME.name();
    }
}
