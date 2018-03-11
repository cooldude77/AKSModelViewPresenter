package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.mainapp.features.signup.form.PresenterResponseInterface;
import com.instanect.mainapp.layers.business.mvp.view.interfaces.ViewInterface;

/**
 * PresenterInterface.
 */

public interface PresenterInterface {
    void attachPresenterAsResponseToInteractors();

    void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface);

    void attachView(ViewInterface viewInterface);
}
