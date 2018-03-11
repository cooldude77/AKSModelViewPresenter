package com.instanect.aks_mvp.mvp.interactors.account;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorResponseInterface;

/**
 * Created by AKS on 10/7/2017.
 */

public abstract class AbstractAccountInteractor implements AccountInteractorInterface {

    protected final AppAccountManagerInterface appAccountManagerInterface;
    protected AccountInteractorResponseInterface accountInteractorResponseInterface;

    public AbstractAccountInteractor(AppAccountManagerInterface appAccountManagerInterface) {


        this.appAccountManagerInterface = appAccountManagerInterface;

    }

    @Override
    public void createAccount(String email, String token, String username) throws Exception {

        if (appAccountManagerInterface.accountExists())
            throw new AccountAlreadyExistsException();
        else
            appAccountManagerInterface.createAccount(
                    email,
                    token,
                    username);
    }

    @Override
    public void setAccountInteractorResponseInterface(AccountInteractorResponseInterface accountInteractorResponseInterface) {
        this.accountInteractorResponseInterface = accountInteractorResponseInterface;
    }
}
