package com.instanect.aks_mvp.mvp.interactors.account;

/**
 * Created by AKS on 3/11/2018.
 */

public interface AppAccountManagerInterface {
    boolean accountExists();

    void createAccount(String email, String token, String username);
}
