package com.instanect.aks_mvp.mvp.interactors.network;


import com.instanect.aks_mvp.mvp.interactors.extractor.NetworkResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;

import junit.framework.Assert;

/**
 * AbstractNetworkInteractor
 */

abstract public class AbstractNetworkInteractor implements NetworkInteractorInterface,
        ScenarioExecutionResponseInterface {
    protected final ScenarioServiceInterface scenarioServiceInterface;

    protected NetworkInteractorResponseInterface networkInteractorResponseInterface;

    public AbstractNetworkInteractor(ScenarioServiceInterface scenarioServiceInterface) {
        this.scenarioServiceInterface = scenarioServiceInterface;
    }

    @Override
    public void setNetworkInteractorResponseInterface(NetworkInteractorResponseInterface networkInteractorResponseInterface) {
        this.networkInteractorResponseInterface = networkInteractorResponseInterface;
    }

    @Override
    public void onError(String errorMessage, int errorCode) {
        Assert.assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onNetworkInteractorScenarioCallFailure(errorMessage, errorCode);
    }

    @Override
    public void onInternetNotAvailable() {
        Assert.assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onInternetNotAvailable();
    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {
        Assert.assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onAdditionUrlNotAvailable(messageOnNotAvailable);
    }

    @Override
    public void onScenarioExecutionAbort() {
        networkInteractorResponseInterface.onNetworkCallAbort();
    }

    @Override
    public <T> void onSuccess(NetworkResponseInterface<T> networkResponse) {
        Assert.assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onNetworkInteractorCallSuccessful(networkResponse);
    }


    public void tryAbort() {

        scenarioServiceInterface.tryAbort();

    }


}
