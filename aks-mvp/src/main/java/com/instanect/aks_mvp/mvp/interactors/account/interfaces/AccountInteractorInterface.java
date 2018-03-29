package com.instanect.aks_mvp.mvp.interactors.account.interfaces;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountCreateResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountQueryResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.response.AccountUpdateResponseInterface;

/**
 * Created by AKS on 10/26/2017.
 */

public interface AccountInteractorInterface {

    void setAccountCreateResponseInterface(AccountCreateResponseInterface accountCreateResponseInterface);

    void setAccountUpdateResponseInterface(AccountUpdateResponseInterface accountUpdateResponseInterface);

    void setAccountQueryResponseInterface(AccountQueryResponseInterface accountQueryResponseInterface);
}
