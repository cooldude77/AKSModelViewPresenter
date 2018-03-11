package com.instanect.aks_mvp.mvp.interactors.account.interfaces;

/**
 * Created by AKS on 10/7/2017.
 */

public interface AccountInteractorInterface {
    void createAccount(String email, String token, String username) throws Exception;

    void setAccountInteractorResponseInterface(AccountInteractorResponseInterface accountInteractorResponseInterface);
}
