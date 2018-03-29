package com.instanect.aks_mvp.mvp.interactors.account.di;


import com.instanect.aks_mvp.mvp.interactors.account.builder.AccountInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class AccountInteractorBuilderModule {

    @Provides
    public AccountInteractorBuilder provideAccountInteractorBuilder() {
        return new AccountInteractorBuilder();
    }

}
