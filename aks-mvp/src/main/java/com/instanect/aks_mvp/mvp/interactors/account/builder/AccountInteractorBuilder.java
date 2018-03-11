package com.instanect.aks_mvp.mvp.interactors.account.builder;

import android.accounts.AccountManager;
import android.content.Context;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * AccountInteractorBuilder
 */

public class AccountInteractorBuilder {

    private Context context;

    public AccountInteractorBuilder(Context context) {

        this.context = context;
    }


    public AccountInteractorInterface getInstance(Class<? extends AccountInteractorInterface> cAccountInteractorInterface) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        AccountManager manager = AccountManager.get(context);

        return null;

    }
}
