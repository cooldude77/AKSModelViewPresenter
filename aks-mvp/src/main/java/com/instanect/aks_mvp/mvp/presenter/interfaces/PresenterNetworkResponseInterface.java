package com.instanect.aks_mvp.mvp.presenter.interfaces;

/**
 * Created by AKS on 3/20/2018.
 */

public interface PresenterNetworkResponseInterface extends PresenterResponseInterface {

    void onNetworkCallSuccess(String successMessage);

    // When scenario fail
    void onNetworkCallFailure(
            String failureMessages, int errorCode);

    // When internet connection failed
    void onInternetNotAvailable();

    // When additional Uri failed
    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();
}
