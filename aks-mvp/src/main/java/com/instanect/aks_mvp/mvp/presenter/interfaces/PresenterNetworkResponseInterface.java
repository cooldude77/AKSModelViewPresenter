package com.instanect.aks_mvp.mvp.presenter.interfaces;

/**
 * Created by AKS on 3/20/2018.
 */

public interface PresenterNetworkResponseInterface extends PresenterResponseInterface {
    // When scenario fail
    void onNetworkInteractorScenarioCallFailure(
            String failureMessages, int errorCode);

    // When internet connection failed
    void onInternetNotAvailable();

    // When additional Uri failed
    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();
}
