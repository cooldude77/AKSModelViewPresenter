package com.instanect.aks_mvp.mvp.interactors.network.di;


import com.instanect.aks_mvp.mvp.interactors.network.builder.NetworkInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = NetworkInteractorBuilderModule.class,
        dependencies = {})
public interface NetworkInteractorBuilderComponent {
    NetworkInteractorBuilder getNetworkInteractorBuilder();
}
