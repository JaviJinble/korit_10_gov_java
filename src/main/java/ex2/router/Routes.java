package ex2.router;

import ex2.view.AccountView;
import ex2.view.HomeView;
import ex2.view.View;
import lombok.Getter;

public enum Routes { // enum 공부하기 enum이 무엇인가? 저장
    HOME(new HomeView()), ACCOUNT(new AccountView()), DEPOSIT(null), WITHDRAWAL(null);

    @Getter
    private View view;

    Routes(View view) {
        this.view = view;
    }
}
