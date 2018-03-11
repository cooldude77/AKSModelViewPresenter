package com.instanect.aks_mvp.mvp.interactors.permission.di;

import com.instanect.mainapp.layers.business.mvp.interactors.permission.builder.PermissionInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class PermissionInteractorBuilderModule {

    @Provides
    public PermissionInteractorBuilder providePermissionInteractorBuilder() {
        return new PermissionInteractorBuilder();
    }

}
