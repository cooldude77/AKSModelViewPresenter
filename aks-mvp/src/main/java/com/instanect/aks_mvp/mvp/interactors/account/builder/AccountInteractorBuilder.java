package com.instanect.aks_mvp.mvp.interactors.account.builder;

import com.instanect.accountcommon.account.account.operations.interfaces.AccountCreateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountQueryInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountUpdateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountCreateResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountQueryResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountUpdateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;

public class AccountInteractorBuilder {
    private AccountCreateInterface accountCreateInterface;
    private AccountUpdateInterface accountUpdateInterface;
    private AccountQueryInterface accountQueryInterface;


    private AccountCreateResponseInterface accountCreateResponseInterface;
    private AccountUpdateResponseInterface accountUpdateResponseInterface;
    private AccountQueryResponseInterface accountQueryResponseInterface;

    private Class<? extends AccountInteractorInterface> accountInteractorClass;

    public AccountInteractorBuilder setAccountInteractorClass(
            Class<? extends AccountInteractorInterface> accountInteractorClass) {
        this.accountInteractorClass = accountInteractorClass;
        return this;
    }


    public AccountInteractorBuilder setAccountCreateInterface(AccountCreateInterface accountCreateInterface) {
        this.accountCreateInterface = accountCreateInterface;
        return this;
    }

    public AccountInteractorBuilder setAccountUpdateInterface(AccountUpdateInterface accountUpdateInterface) {
        this.accountUpdateInterface = accountUpdateInterface;
        return this;
    }

    public AccountInteractorBuilder setAccountQueryInterface(AccountQueryInterface accountQueryInterface) {
        this.accountQueryInterface = accountQueryInterface;
        return this;
    }

    public AccountInteractorBuilder setAccountCreateResponseInterface(AccountCreateResponseInterface accountCreateResponseInterface) {
        this.accountCreateResponseInterface = accountCreateResponseInterface;
        return this;
    }

    public AccountInteractorBuilder setAccountUpdateResponseInterface(AccountUpdateResponseInterface accountUpdateResponseInterface) {
        this.accountUpdateResponseInterface = accountUpdateResponseInterface;
        return this;
    }

    public AccountInteractorBuilder setAccountQueryResponseInterface(AccountQueryResponseInterface accountQueryResponseInterface) {
        this.accountQueryResponseInterface = accountQueryResponseInterface;
        return this;
    }

    public AccountInteractorInterface build() throws IllegalAccessException, InstantiationException {

        AccountInteractorInterface accountInteractorInterface
                = accountInteractorClass
                .newInstance();

        setAccountClasses(accountInteractorInterface);

        setResponseInterfaces(accountInteractorInterface);

        return accountInteractorInterface;
    }

    private void setResponseInterfaces(AccountInteractorInterface accountInteractorInterface) {

        if (accountCreateInterface != null)
            if (accountInteractorInterface instanceof AccountCreateResponseInterface)
                accountCreateInterface.setAccountCreateResponseInterface(
                        (AccountCreateResponseInterface) accountInteractorInterface
                );
        if (accountUpdateInterface != null)
            if (accountInteractorInterface instanceof AccountUpdateResponseInterface)
                accountUpdateInterface.setAccountUpdateResponseInterface(
                        (AccountUpdateResponseInterface) accountInteractorInterface
                );
        if (accountQueryInterface != null)
            if (accountInteractorInterface instanceof AccountQueryResponseInterface)
                accountQueryInterface.setAccountQueryResponseInterface(
                        (AccountQueryResponseInterface) accountInteractorInterface
                );
    }

    private void setAccountClasses(AccountInteractorInterface accountInteractorInterface) {

        if (accountCreateInterface != null)
            accountInteractorInterface.setAccountCreateInterface(accountCreateInterface);
        if (accountUpdateInterface != null)
            accountInteractorInterface.setAccountUpdateInterface(accountUpdateInterface);
        if (accountQueryInterface != null)
            accountInteractorInterface.setAccountQueryInterface(accountQueryInterface);
    }

}