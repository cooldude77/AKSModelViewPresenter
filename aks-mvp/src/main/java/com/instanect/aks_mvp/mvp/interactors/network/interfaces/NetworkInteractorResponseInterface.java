package com.instanect.aks_mvp.mvp.interactors.network.interfaces;

import com.instanect.aks_mvp.mvp.presenter.InteractorResponseInterface;
import com.instanect.networkcommon.NetworkResponseInterface;

/**
 * Created by AKS on 10/6/2017.
 */

public interface NetworkInteractorResponseInterface extends InteractorResponseInterface {

    // When scenario is successful
    <T> void onNetworkInteractorCallSuccessful(
            NetworkResponseInterface<T> networkResponse);

    // When scenario fail
    void onNetworkInteractorScenarioCallFailure(
            String failureMessages, int errorCode);

    // When internet connection failed
    void onInternetNotAvailable();

    // When additional Uri failed
    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();
}
