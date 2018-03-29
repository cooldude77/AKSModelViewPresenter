package com.instanect.aks_mvp.mvp.interactors.account;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountCreateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountQueryResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountUpdateResponseInterface;

/**
 * Created by AKS on 10/7/2017.
 */

public abstract class AbstractAccountInteractor implements AccountInteractorInterface {

    private final AccountCreateInterface accountCreateInterface;
    private final AccountUpdateInterface accountUpdateInterface;
    private final AccountQueryInterface accountQueryInterface;

    private AccountCreateResponseInterface accountCreateResponseInterface;
    private AccountUpdateResponseInterface accountUpdateResponseInterface;
    private AccountQueryResponseInterface accountQueryResponseInterface;


    public AbstractAccountInteractor(
            AccountCreateInterface accountCreateInterface,
            AccountUpdateInterface accountUpdateInterface,
            AccountQueryInterface accountQueryInterface) {

        this.accountCreateInterface = accountCreateInterface;
        this.accountUpdateInterface = accountUpdateInterface;
        this.accountQueryInterface = accountQueryInterface;
    }

    public AccountCreateInterface getAccountCreateInterface() {
        return accountCreateInterface;
    }

    public AccountUpdateInterface getAccountUpdateInterface() {
        return accountUpdateInterface;
    }

    public AccountQueryInterface getAccountQueryInterface() {
        return accountQueryInterface;
    }

    public AccountCreateResponseInterface getAccountCreateResponseInterface() {
        return accountCreateResponseInterface;
    }

    @Override
    public void setAccountCreateResponseInterface(AccountCreateResponseInterface accountCreateResponseInterface) {
        this.accountCreateResponseInterface = accountCreateResponseInterface;
    }

    public AccountUpdateResponseInterface getAccountUpdateResponseInterface() {
        return accountUpdateResponseInterface;
    }

    @Override
    public void setAccountUpdateResponseInterface(AccountUpdateResponseInterface accountUpdateResponseInterface) {
        this.accountUpdateResponseInterface = accountUpdateResponseInterface;
    }

    public AccountQueryResponseInterface getAccountQueryResponseInterface() {
        return accountQueryResponseInterface;
    }

    @Override
    public void setAccountQueryResponseInterface(AccountQueryResponseInterface accountQueryResponseInterface) {
        this.accountQueryResponseInterface = accountQueryResponseInterface;
    }


}
