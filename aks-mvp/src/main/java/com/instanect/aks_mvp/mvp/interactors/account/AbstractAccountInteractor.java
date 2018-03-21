package com.instanect.aks_mvp.mvp.interactors.account;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateResponseInterface;

/**
 * Created by AKS on 10/7/2017.
 */

public abstract class AbstractAccountInteractor
        implements AccountCreateResponseInterface,
        AccountUpdateResponseInterface,
        AccountQueryResponseInterface {

    private final AccountCreateInterface accountCreateInterface;
    private final AccountUpdateInterface accountUpdateInterface;
    private final AccountQueryInterface accountQueryInterface;
    protected AccountInteractorResponseInterface accountInteractorResponseInterface;

    public AbstractAccountInteractor(
            AccountCreateInterface accountCreateInterface,
            AccountUpdateInterface accountUpdateInterface,
            AccountQueryInterface accountQueryInterface) {

        this.accountCreateInterface = accountCreateInterface;
        this.accountUpdateInterface = accountUpdateInterface;
        this.accountQueryInterface = accountQueryInterface;
    }

}
