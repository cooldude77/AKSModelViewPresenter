package com.instanect.aks_mvp.mvp.interactors.preferences.interfaces;

import com.instanect.aks_mvp.mvp.presenter.PresenterAsResponseToInteractorInterface;

/**
 * Created by AKS on 10/26/2017.
 */

public interface PreferencesInteractorResponseInterface extends PresenterAsResponseToInteractorInterface {
    void onPreferencesSaveSuccess();
}
