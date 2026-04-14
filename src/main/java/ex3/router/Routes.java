package ex3.router;

import ex3.view.*;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()),
    ACCOUNT(new AccountView()),
    CREATE_ACCOUNT(new CreateAccountView()),
    DEPOSIT(new DepositView()),
    WITHDRAW(new WithdrawView()),
    FIND_ACCOUNT(new FindAccountView()),
    ACCOUNT_LIST(new AccountListView()),
    HISTORY(new HistoryView());

    @Getter
    private final View view;

    Routes(View view) { this.view = view; }
}
