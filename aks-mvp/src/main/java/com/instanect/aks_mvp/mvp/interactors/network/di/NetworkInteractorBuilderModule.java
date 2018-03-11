package com.instanect.aks_mvp.mvp.interactors.network.di;


import android.content.Context;

import com.instanect.mainapp.layers.business.declarations.uri.di.ApiUriDeclarationComponent;
import com.instanect.mainapp.layers.business.declarations.uri.di.ApiUriDeclarationModule;
import com.instanect.mainapp.layers.business.declarations.uri.di.DaggerApiUriDeclarationComponent;
import com.instanect.mainapp.layers.business.mvp.interactors.network.builder.DaggerInternetConnectionCheckerComponent;
import com.instanect.mainapp.layers.business.mvp.interactors.network.builder.InternetConnectionCheckerComponent;
import com.instanect.mainapp.layers.business.mvp.interactors.network.builder.InternetConnectionCheckerModule;
import com.instanect.mainapp.layers.business.mvp.interactors.network.builder.NetworkInteractorBuilder;
import com.instanect.mainapp.layers.network.rest.resolver.di.CurieResolverComponent;
import com.instanect.mainapp.layers.network.rest.resolver.di.DaggerCurieResolverComponent;
import com.instanect.restvolley.newNetwork.common.api.di.DaggerRESTNetworkApiComponent;
import com.instanect.restvolley.newNetwork.common.api.di.RESTNetworkApiComponent;
import com.instanect.restvolley.newNetwork.common.api.di.RESTNetworkApiModule;
import com.instanect.restvolley.newNetwork.common.handler.builder.di.DaggerTravellerNodeHandlerBuilderComponent;
import com.instanect.restvolley.newNetwork.common.handler.builder.di.TravellerNodeHandlerBuilderComponent;
import com.instanect.restvolley.newNetwork.common.handler.builder.di.TravellerNodeHandlerBuilderModule;
import com.instanect.restvolley.newNetwork.common.handler.service.di.DaggerTravelNodeHandlerServiceComponent;
import com.instanect.restvolley.newNetwork.common.handler.service.di.TravelNodeHandlerServiceComponent;
import com.instanect.restvolley.newNetwork.common.handler.service.di.TravelNodeHandlerServiceModule;
import com.instanect.restvolley.newNetwork.common.scenario.executor.builder.di.DaggerScenarioExecutorBuilderComponent;
import com.instanect.restvolley.newNetwork.common.scenario.executor.builder.di.ScenarioExecutorBuilderComponent;
import com.instanect.restvolley.newNetwork.common.scenario.executor.builder.di.ScenarioExecutorBuilderModule;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.builder.di.DaggerScenarioBuilderComponent;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.builder.di.ScenarioBuilderComponent;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.di.DaggerScenarioServiceComponent;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.di.ScenarioServiceComponent;
import com.instanect.restvolley.newNetwork.common.traveller.builder.di.DaggerTravellerBuilderComponent;
import com.instanect.restvolley.newNetwork.common.traveller.builder.di.TravellerBuilderComponent;
import com.instanect.restvolley.newNetwork.common.traveller.builder.di.TravellerBuilderModule;
import com.instanect.restvolley.newNetwork.volley.api.di.DaggerVolleyApiComponent;
import com.instanect.restvolley.newNetwork.volley.api.di.VolleyApiComponent;
import com.instanect.restvolley.newNetwork.volley.api.di.VolleyApiModule;
import com.instanect.restvolley.newNetwork.volley.client.di.DaggerUriHttpClientRequestBuilderComponent;
import com.instanect.restvolley.newNetwork.volley.client.di.UriHttpClientRequestBuilderComponent;
import com.instanect.restvolley.newNetwork.volley.client.di.UriHttpClientRequestBuilderModule;
import com.instanect.restvolley.newNetwork.volley.request.di.DaggerRequestQueueComponent;
import com.instanect.restvolley.newNetwork.volley.request.di.RequestQueueComponent;
import com.instanect.restvolley.newNetwork.volley.request.di.RequestQueueModule;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class NetworkInteractorBuilderModule {

    private Context context;

    public NetworkInteractorBuilderModule(Context context) {

        this.context = context;
    }

    @Provides
    public NetworkInteractorBuilder provideNetworkInteractorBuilder() {

        RequestQueueComponent requestQueueComponent = DaggerRequestQueueComponent.builder()
                .requestQueueModule(new RequestQueueModule(context))
                .build();

        UriHttpClientRequestBuilderComponent uriHttpClientRequestBuilderComponent
                = DaggerUriHttpClientRequestBuilderComponent
                .builder()
                .uriHttpClientRequestBuilderModule(
                        new UriHttpClientRequestBuilderModule(context))
                .build();

        VolleyApiComponent volleyApiComponent =
                DaggerVolleyApiComponent.builder()
                        .volleyApiModule(new VolleyApiModule())
                        .requestQueueComponent(requestQueueComponent)
                        .uriHttpClientRequestBuilderComponent(uriHttpClientRequestBuilderComponent)
                        .build();

        RESTNetworkApiComponent restNetworkApiComponent
                = DaggerRESTNetworkApiComponent.builder()
                .rESTNetworkApiModule(new RESTNetworkApiModule(context))
                .volleyApiComponent(volleyApiComponent)
                .build();

        ScenarioBuilderComponent scenarioBuilderComponent
                = DaggerScenarioBuilderComponent
                .create();

        InternetConnectionCheckerComponent
                internetConnectionCheckerComponent
                = DaggerInternetConnectionCheckerComponent
                .builder()
                .rESTNetworkApiComponent(restNetworkApiComponent)
                .internetConnectionCheckerModule(new InternetConnectionCheckerModule())
                .build();

        CurieResolverComponent curieResolverComponent
                = DaggerCurieResolverComponent
                .create();

        ApiUriDeclarationComponent apiUriDeclarationComponent =
                DaggerApiUriDeclarationComponent
                        .builder().apiUriDeclarationModule(new ApiUriDeclarationModule(context))
                        .build();

        TravellerNodeHandlerBuilderComponent travellerNodeHandlerBuilderComponent
                = DaggerTravellerNodeHandlerBuilderComponent
                .builder()
                .curieResolverComponent(curieResolverComponent)
                .apiUriDeclarationComponent(apiUriDeclarationComponent)
                .rESTNetworkApiComponent(restNetworkApiComponent)
                .travellerNodeHandlerBuilderModule(new TravellerNodeHandlerBuilderModule())
                .build();

        TravelNodeHandlerServiceComponent travelNodeHandlerServiceComponent
                = DaggerTravelNodeHandlerServiceComponent
                .builder()
                .travelNodeHandlerServiceModule(new TravelNodeHandlerServiceModule())
                .travellerNodeHandlerBuilderComponent(travellerNodeHandlerBuilderComponent)
                .build();

        TravellerBuilderComponent travellerBuilderComponent
                = DaggerTravellerBuilderComponent
                .builder()
                .travelNodeHandlerServiceComponent(travelNodeHandlerServiceComponent)
                .travellerBuilderModule(new TravellerBuilderModule())
                .build();

        ScenarioExecutorBuilderComponent scenarioExecutorBuilderComponent
                = DaggerScenarioExecutorBuilderComponent
                .builder()
                .scenarioExecutorBuilderModule(new ScenarioExecutorBuilderModule())
                .travellerBuilderComponent(travellerBuilderComponent)
                .build();

        ScenarioServiceComponent scenarioServiceComponent
                = DaggerScenarioServiceComponent
                .builder()
                .apiUriDeclarationComponent(apiUriDeclarationComponent)
                .scenarioBuilderComponent(scenarioBuilderComponent)
                .internetConnectionCheckerComponent(internetConnectionCheckerComponent)
                .scenarioExecutorBuilderComponent(scenarioExecutorBuilderComponent)
                .build();


        return new NetworkInteractorBuilder(
                scenarioServiceComponent.getScenarioService());
    }


}
