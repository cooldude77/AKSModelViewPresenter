package com.instanect.aks_mvp.mvp.interactors.network.builder;

import com.instanect.mainapp.layers.business.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.ScenarioService;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/5/2017.
 */

public class NetworkInteractorBuilder {

    private ScenarioService scenarioService;

    public NetworkInteractorBuilder(ScenarioService scenarioService) {

        this.scenarioService = scenarioService;
    }

    public NetworkInteractorInterface getInstance(
            Class<? extends NetworkInteractorInterface> cNetworkInteractorInterface
    )
            throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class[] arguments = new Class[1];
        arguments[0] = ScenarioService.class;


        return cNetworkInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(
                        scenarioService
                );


    }
}
