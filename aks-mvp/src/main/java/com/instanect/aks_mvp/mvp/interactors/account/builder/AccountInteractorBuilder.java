package com.instanect.aks_mvp.mvp.interactors.account.builder;

import android.content.Context;

import com.instanect.aks_mvp.mvp.interactors.account.AbstractAccountInteractor;
import com.instanect.aks_mvp.mvp.interactors.account.AppAccountManagerInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * AccountInteractorBuilder
 */

public class AccountInteractorBuilder {

    public AccountInteractorInterface getInstance(
            Class<? extends AbstractAccountInteractor> accountInteractorClass,
            AppAccountManagerInterface appAccountManagerInterface)
            throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {

        Class[] arguments = new Class[1];
        arguments[0] = appAccountManagerInterface.getClass();


        return accountInteractorClass
                .getDeclaredConstructor(arguments)
                .newInstance(appAccountManagerInterface);

    }
}
