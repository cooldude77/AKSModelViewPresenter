package com.instanect.aks_mvp.mvp.interactors.network;


import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkExecutionResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.networkcommon.NetworkInterface;
import com.instanect.networkcommon.NetworkResponseInterface;

import static org.junit.Assert.assertNotNull;

/**
 * AbstractNetworkInteractor
 */

abstract public class AbstractNetworkInteractor implements NetworkInteractorInterface,
        NetworkExecutionResponseInterface {
    private NetworkInterface networkInterface;

    private NetworkInteractorResponseInterface networkInteractorResponseInterface;

    public AbstractNetworkInteractor(NetworkInterface networkInterface) {
        this.networkInterface = networkInterface;
    }

    @Override
    public NetworkInterface getNetworkInterface() {
        return networkInterface;
    }

    @Override
    public NetworkInteractorResponseInterface getNetworkInteractorResponseInterface() {
        return networkInteractorResponseInterface;
    }

    @Override
    public void setNetworkInteractorResponseInterface(NetworkInteractorResponseInterface networkInteractorResponseInterface) {
        this.networkInteractorResponseInterface = networkInteractorResponseInterface;
    }

    @Override
    public void onError(String errorMessage, int errorCode) {
        assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onNetworkInteractorScenarioCallFailure(errorMessage, errorCode);
    }

    @Override
    public void onInternetNotAvailable() {
        assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onInternetNotAvailable();
    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {
        assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onAdditionalUrlNotAvailable(messageOnNotAvailable);
    }

    @Override
    public void onScenarioExecutionAbort() {
        networkInteractorResponseInterface.onNetworkCallAbort();
    }

    @Override
    public <T> void onSuccess(NetworkResponseInterface<T> networkResponse) {
        assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onNetworkInteractorCallSuccessful(networkResponse);
    }

    public void tryAbort() {
        networkInterface.tryAbort();
    }


}
