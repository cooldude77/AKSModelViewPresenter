package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.extractor.NetworkResponseInterface;

/**
 * Created by AKS on 3/12/2018.
 */

public interface PresenterNetworkResponseInterface extends PresenterResponseInterface
{
    void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode);

    void onInternetNotAvailable();

    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();

    <T> void onNetworkInteractorCallSuccessful(NetworkResponseInterface<T> networkResponseInterface);
}
