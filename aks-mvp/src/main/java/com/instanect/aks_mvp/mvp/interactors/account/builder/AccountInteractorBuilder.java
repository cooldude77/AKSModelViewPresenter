package com.instanect.aks_mvp.mvp.interactors.account.builder;

import android.accounts.AccountManager;
import android.content.Context;

import com.instanect.mainapp.features.signup.form.process.device.interactor.SignUpFormProcessOnDeviceAccountInteractor;
import com.instanect.mainapp.layers.business.authentication.account.AppAccountManager;
import com.instanect.mainapp.layers.business.authentication.factory.AppAccountCreateBundleFactory;
import com.instanect.mainapp.layers.business.authentication.factory.AppAccountCreateFactory;
import com.instanect.mainapp.layers.business.declarations.AccountDetailsDeclaration;
import com.instanect.mainapp.layers.business.mvp.interactors.account.interfaces.AccountInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 AccountInteractorBuilder
 */

public class AccountInteractorBuilder {

    private Context context;

    public AccountInteractorBuilder(Context context) {

        this.context = context;
    }


    public AccountInteractorInterface getInstance(Class<? extends AccountInteractorInterface> cAccountInteractorInterface) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        AccountManager manager = AccountManager.get(context);

        return new SignUpFormProcessOnDeviceAccountInteractor(
                new AppAccountManager(manager,
                        new AccountDetailsDeclaration(context),
                        new AppAccountCreateFactory(),
                        new AppAccountCreateBundleFactory())
        );


    }
}
