package com.instanect.aks_mvp.mvp.interactors.network.builder;

import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/5/2017.
 */

public class NetworkInteractorBuilder {


    public NetworkInteractorInterface getInstance(
            Class<? extends NetworkInteractorInterface> cNetworkInteractorInterface,
            NetworkInterface networkInterface)
            throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class[] arguments = new Class[1];
        arguments[0] = NetworkInterface.class;


        return cNetworkInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(
                        networkInterface
                );


    }
}
