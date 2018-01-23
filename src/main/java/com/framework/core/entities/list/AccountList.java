package com.framework.core.entities.list;




import java.util.ArrayList;
import java.util.List;

import com.framework.core.springmvc.domain.Account;


public class AccountList {

    private List<Account> accounts = new ArrayList<Account>();

    public AccountList(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
