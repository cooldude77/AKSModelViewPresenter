package com.instanect.aks_mvp.mvp.interactors.account.interfaces;

import com.instanect.accountcommon.account.account.operations.interfaces.AccountCreateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountQueryInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.AccountUpdateInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountCreateResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountQueryResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountUpdateResponseInterface;

/**
 * Created by AKS on 10/26/2017.
 */

public interface AccountInteractorInterface {

    void setAccountCreateResponseInterface(AccountCreateResponseInterface accountCreateResponseInterface);

    void setAccountUpdateResponseInterface(AccountUpdateResponseInterface accountUpdateResponseInterface);

    void setAccountQueryResponseInterface(AccountQueryResponseInterface accountQueryResponseInterface);

    void setAccountCreateInterface(AccountCreateInterface accountCreateInterface);

    void setAccountUpdateInterface(AccountUpdateInterface accountUpdateInterface);

    void setAccountQueryInterface(AccountQueryInterface accountQueryInterface);
}
