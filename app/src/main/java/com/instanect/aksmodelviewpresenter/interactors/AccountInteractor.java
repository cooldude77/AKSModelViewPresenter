package com.instanect.aksmodelviewpresenter.interactors;

import com.instanect.aks_mvp.mvp.interactors.account.AbstractAccountInteractor;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountCreateInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountQueryInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountUpdateInterface;

/**
 * Created by AKS on 3/28/2018.
 */

public class AccountInteractor extends AbstractAccountInteractor {
    public AccountInteractor(AccountCreateInterface accountCreateInterface, AccountUpdateInterface accountUpdateInterface, AccountQueryInterface accountQueryInterface) {
        super(accountCreateInterface, accountUpdateInterface, accountQueryInterface);
    }
}
