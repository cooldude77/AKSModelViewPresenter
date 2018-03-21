package com.instanect.aks_mvp.mvp.interactors.account.builder;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * AccountInteractorBuilder
 */

public class AccountInteractorBuilder {

    public AccountInteractorInterface getInstance(
            Class<? extends AccountInteractorInterface> accountInteractorClass,
            AccountCreateInterface accountCreateInterface,
            AccountUpdateInterface accountUpdateInterface,
            AccountQueryInterface accountQueryInterface)
            throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        Class[] arguments = new Class[3];
        arguments[0] = accountCreateInterface.getClass();
        arguments[1] = accountUpdateInterface.getClass();
        arguments[2] = accountQueryInterface.getClass();


        return accountInteractorClass
                .getDeclaredConstructor(arguments)
                .newInstance(accountCreateInterface,
                        accountUpdateInterface,
                        accountQueryInterface);

    }
}
