package com.instanect.aks_mvp.mvp.presenter.interfaces;

/**
 * Created by AKS on 3/20/2018.
 */

public interface PresenterNetworkResponseInterface extends PresenterResponseInterface {

    // Success methods are defined by individual presenters

    // Here only common failure methods are not

    // When internet connection failed
    void onInternetNotAvailable();

    // When additional Uri failed
    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();
}
