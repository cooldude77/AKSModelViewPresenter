package com.instanect.aks_mvp.mvp.interactors.network.builder;

import com.instanect.restvolley.newNetwork.common.api.di.RESTNetworkApiComponent;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.di.InternetConnectionChecker;

import dagger.Component;

/**
 * Created by AKS on 10/25/2017.
 */
@Component(modules = InternetConnectionCheckerModule.class,
        dependencies = {RESTNetworkApiComponent.class})
public interface InternetConnectionCheckerComponent {
    InternetConnectionChecker getInternetConnectionChecker();
}
