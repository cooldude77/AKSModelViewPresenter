package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.view.interfaces.ViewInterface;

/**
 * PresenterInterface.
 */

public interface PresenterInterface {
    void attachPresenterAsResponseToInteractors();

    void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface);

    void attachView(ViewInterface viewInterface);
}
