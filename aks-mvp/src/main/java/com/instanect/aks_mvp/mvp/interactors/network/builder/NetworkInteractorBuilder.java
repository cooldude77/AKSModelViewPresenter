package com.instanect.aks_mvp.mvp.interactors.network.builder;

import com.instanect.aks_mvp.mvp.interactors.network.ScenarioServiceInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/5/2017.
 */

public class NetworkInteractorBuilder {

    private ScenarioServiceInterface scenarioServiceInterface;

    public NetworkInteractorBuilder(ScenarioServiceInterface scenarioServiceInterface) {

        this.scenarioServiceInterface = scenarioServiceInterface;
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
        arguments[0] = ScenarioServiceInterface.class;


        return cNetworkInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(
                        scenarioServiceInterface
                );


    }
}
