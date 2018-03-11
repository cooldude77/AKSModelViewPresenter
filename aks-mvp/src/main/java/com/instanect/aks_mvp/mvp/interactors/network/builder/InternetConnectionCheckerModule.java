package com.instanect.aks_mvp.mvp.interactors.network.builder;

import com.instanect.restvolley.newNetwork.common.api.RESTNetworkApi;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.di.InternetConnectionChecker;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/14/2017.
 */
@Module
public class InternetConnectionCheckerModule {

    @Provides
    public InternetConnectionChecker provideAppInternetConnectionChecker(
            RESTNetworkApi restNetworkApi) {
        return new InternetConnectionChecker(restNetworkApi);
    }

}
