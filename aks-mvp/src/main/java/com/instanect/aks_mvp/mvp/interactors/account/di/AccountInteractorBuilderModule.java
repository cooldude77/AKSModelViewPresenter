package com.instanect.aks_mvp.mvp.interactors.account.di;


import android.content.Context;

import com.instanect.mainapp.layers.business.mvp.interactors.account.builder.AccountInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class AccountInteractorBuilderModule {

    private Context context;

    public AccountInteractorBuilderModule(Context context) {

        this.context = context;
    }

    @Provides
    public AccountInteractorBuilder provideAccountInteractorBuilder() {
        return new AccountInteractorBuilder(context);
    }

}
