package com.framework.core.springmvc.service;

import com.framework.core.entities.list.AccountList;
import com.framework.core.exceptions.AccountExistsException;
import com.framework.core.exceptions.AccountNotExistException;
import com.framework.core.springmvc.domain.Account;
import com.framework.core.springmvc.domain.AccountWallet;

public interface AccountService {

    public AccountList findALLAccounts();
    public Account findAccount(Long id);
    public Account findAccount(Account account) throws AccountNotExistException;
    public AccountWallet findAccountWalletByWaletNo(String walletNo) throws AccountNotExistException;
    public AccountWallet findAccountWalletByAccountId(Long acccountId) throws AccountNotExistException;
    public Account findAccountByWaletNo(String walletNo)throws AccountNotExistException;
    public Account createAccount(Account account) throws AccountExistsException;
    public Account findAccount(String loginId) throws AccountNotExistException;

}
