package com.instanect.aks_mvp.mvp.interactors.network;

import com.instanect.mainapp.layers.business.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.restvolley.newNetwork.common.responseObject.NetworkResponse;
import com.instanect.restvolley.newNetwork.common.scenario.executor.interfaces.ScenarioExecutionResponseInterface;
import com.instanect.restvolley.newNetwork.common.scenario.scenario.service.ScenarioService;

import junit.framework.Assert;

/**
 * AbstractNetworkInteractor
 */

abstract public class AbstractNetworkInteractor implements NetworkInteractorInterface,
        ScenarioExecutionResponseInterface {
    protected final ScenarioService scenarioService;

    protected NetworkInteractorResponseInterface networkInteractorResponseInterface;

    public AbstractNetworkInteractor(ScenarioService scenarioService) {
        this.scenarioService = scenarioService;
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
    public <T> void onSuccess(NetworkResponse<T> networkResponse) {
        Assert.assertNotNull(networkInteractorResponseInterface);
        networkInteractorResponseInterface.onNetworkInteractorCallSuccessful(networkResponse);
    }


    public void tryAbort() {

        scenarioService.tryAbort();

    }


}
