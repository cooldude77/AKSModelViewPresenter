package com.instanect.aks_mvp.mvp.interactors.permission.di;

import com.instanect.mainapp.layers.business.mvp.interactors.permission.builder.PermissionInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = PermissionInteractorBuilderModule.class)
public interface PermissionInteractorBuilderComponent {
    PermissionInteractorBuilder providePermissionInteractorBuilder();
}
