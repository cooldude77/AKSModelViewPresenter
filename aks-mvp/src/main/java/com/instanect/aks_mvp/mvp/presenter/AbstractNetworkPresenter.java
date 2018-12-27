package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterNetworkResponseInterface;
import com.instanect.networkcommon.NetworkResponseInterface;

public class AbstractNetworkPresenter extends AbstractPresenter implements NetworkInteractorResponseInterface {

    @Override
    public PresenterNetworkResponseInterface getPresenterResponseInterface() {
        return (PresenterNetworkResponseInterface) super.getPresenterResponseInterface();
    }

    @Override
    public <T> void onNetworkInteractorCallSuccessful(NetworkResponseInterface<T> networkResponse) {

    }

    @Override
    public void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode) {

    }

    @Override
    public void onInternetNotAvailable() {

    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {

    }

    @Override
    public void onNetworkCallAbort() {

    }
}
