package com.instanect.aks_mvp.mvp.interactors.account;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountCreateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountQueryResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountUpdateResponseInterface;

import java.lang.reflect.InvocationTargetException;

public class AbstractAccountInteractorBuilder {
    private AccountCreateInterface accountCreateInterface;
    private AccountUpdateInterface accountUpdateInterface;
    private AccountQueryInterface accountQueryInterface;


    private AccountCreateResponseInterface accountCreateResponseInterface;
    private AccountUpdateResponseInterface accountUpdateResponseInterface;
    private AccountQueryResponseInterface accountQueryResponseInterface;

    private Class<? extends AccountInteractorInterface> accountInteractorClass;

    public AbstractAccountInteractorBuilder setAccountInteractorClass(
            Class<? extends AccountInteractorInterface> accountInteractorClass) {
        this.accountInteractorClass = accountInteractorClass;
        return this;
    }


    public AbstractAccountInteractorBuilder setAccountCreateInterface(AccountCreateInterface accountCreateInterface) {
        this.accountCreateInterface = accountCreateInterface;
        return this;
    }

    public AbstractAccountInteractorBuilder setAccountUpdateInterface(AccountUpdateInterface accountUpdateInterface) {
        this.accountUpdateInterface = accountUpdateInterface;
        return this;
    }

    public AbstractAccountInteractorBuilder setAccountQueryInterface(AccountQueryInterface accountQueryInterface) {
        this.accountQueryInterface = accountQueryInterface;
        return this;
    }

    public AbstractAccountInteractorBuilder setAccountCreateResponseInterface(AccountCreateResponseInterface accountCreateResponseInterface) {
        this.accountCreateResponseInterface = accountCreateResponseInterface;
        return this;
    }

    public AbstractAccountInteractorBuilder setAccountUpdateResponseInterface(AccountUpdateResponseInterface accountUpdateResponseInterface) {
        this.accountUpdateResponseInterface = accountUpdateResponseInterface;
        return this;
    }

    public AbstractAccountInteractorBuilder setAccountQueryResponseInterface(AccountQueryResponseInterface accountQueryResponseInterface) {
        this.accountQueryResponseInterface = accountQueryResponseInterface;
        return this;
    }

    public AccountInteractorInterface build() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {


        Class[] arguments = new Class[3];

        arguments[0] = accountCreateInterface.getClass();
        arguments[1] = accountUpdateInterface.getClass();
        arguments[2] = accountQueryInterface.getClass();

        return accountInteractorClass
                .getDeclaredConstructor(arguments)
                .newInstance(
                        accountCreateInterface,
                        accountUpdateInterface,
                        accountQueryInterface);
    }

}