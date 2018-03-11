package com.instanect.aks_mvp.mvp.interactors.account.di;


import com.instanect.aks_mvp.mvp.interactors.account.builder.AccountInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = AccountInteractorBuilderModule.class)
public interface AccountInteractorBuilderComponent {
    AccountInteractorBuilder provideAccountInteractorBuilder();
}
