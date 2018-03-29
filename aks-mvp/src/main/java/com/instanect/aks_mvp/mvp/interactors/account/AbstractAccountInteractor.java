package com.instanect.aks_mvp.mvp.interactors.account;

import com.instanect.accountcommon.account.account.operations.interfaces.AccountCreateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountQueryInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountUpdateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountCreateResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountQueryResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountUpdateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;

/**
 * Created by AKS on 10/7/2017.
 */

public abstract class AbstractAccountInteractor implements AccountInteractorInterface {

    private AccountCreateInterface accountCreateInterface;
    private AccountUpdateInterface accountUpdateInterface;
    private AccountQueryInterface accountQueryInterface;

    private AccountCreateResponseInterface accountCreateResponseInterface;
    private AccountUpdateResponseInterface accountUpdateResponseInterface;
    private AccountQueryResponseInterface accountQueryResponseInterface;


    public AccountCreateInterface getAccountCreateInterface() {
        return accountCreateInterface;
    }

    @Override
    public void setAccountCreateInterface(AccountCreateInterface accountCreateInterface) {

        this.accountCreateInterface = accountCreateInterface;
    }

    public AccountUpdateInterface getAccountUpdateInterface() {
        return accountUpdateInterface;
    }

    @Override
    public void setAccountUpdateInterface(AccountUpdateInterface accountUpdateInterface) {

        this.accountUpdateInterface = accountUpdateInterface;
    }

    public AccountQueryInterface getAccountQueryInterface() {
        return accountQueryInterface;
    }

    @Override
    public void setAccountQueryInterface(AccountQueryInterface accountQueryInterface) {

        this.accountQueryInterface = accountQueryInterface;
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
