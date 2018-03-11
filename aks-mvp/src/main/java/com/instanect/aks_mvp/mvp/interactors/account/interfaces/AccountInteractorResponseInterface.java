package com.instanect.aks_mvp.mvp.interactors.account.interfaces;

/**
 * Created by AKS on 10/7/2017.
 */

public interface AccountInteractorResponseInterface {
    void onAccountCreationSuccess();

    void onAccountCreationFailure(String errorMessage);
}
