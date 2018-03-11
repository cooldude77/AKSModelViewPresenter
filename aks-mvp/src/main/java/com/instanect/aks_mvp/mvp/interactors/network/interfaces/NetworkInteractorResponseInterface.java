package com.instanect.aks_mvp.mvp.interactors.network.interfaces;

import com.instanect.restvolley.newNetwork.common.responseObject.NetworkResponse;

/**
 * Created by AKS on 10/6/2017.
 */

public interface NetworkInteractorResponseInterface {

    // When scenario is successful
    <T> void onNetworkInteractorCallSuccessful(
            NetworkResponse<T> networkResponse);

    // When scenario fail
    void onNetworkInteractorScenarioCallFailure(
            String failureMessages, int errorCode);

    // When internet connection failed
    void onInternetNotAvailable();

    // When additional Uri failed
    void onAdditionUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();
}
