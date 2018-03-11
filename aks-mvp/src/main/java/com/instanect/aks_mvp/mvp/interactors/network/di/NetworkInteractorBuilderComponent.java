package com.instanect.aks_mvp.mvp.interactors.network.di;

import com.instanect.mainapp.layers.business.mvp.interactors.network.builder.NetworkInteractorBuilder;
import com.instanect.restvolley.newNetwork.common.api.di.RESTNetworkApiComponent;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.di.ScenarioServiceComponent;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = NetworkInteractorBuilderModule.class,
        dependencies = {RESTNetworkApiComponent.class,
                ScenarioServiceComponent.class})
public interface NetworkInteractorBuilderComponent {
    NetworkInteractorBuilder getNetworkInteractorBuilder();
}
