package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterNetworkResponseInterface;

public abstract class AbstractNetworkPresenter extends AbstractPresenter implements NetworkInteractorResponseInterface {

    @Override
    public PresenterNetworkResponseInterface getPresenterResponseInterface() {
        return (PresenterNetworkResponseInterface) super.getPresenterResponseInterface();
    }


    @Override
    public void onInternetNotAvailable() {

        getPresenterResponseInterface().onInternetNotAvailable();
    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {

        getPresenterResponseInterface().onAdditionalUrlNotAvailable(messageOnNotAvailable);
    }

    @Override
    public void onNetworkCallAbort() {
        getPresenterResponseInterface().onNetworkCallAbort();
    }
}
