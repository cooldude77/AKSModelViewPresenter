package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterNetworkResponseInterface;

public class AbstractNetworkPresenter extends AbstractPresenter {

    @Override
    public PresenterNetworkResponseInterface getPresenterResponseInterface() {
        return (PresenterNetworkResponseInterface) super.getPresenterResponseInterface();
    }
}
