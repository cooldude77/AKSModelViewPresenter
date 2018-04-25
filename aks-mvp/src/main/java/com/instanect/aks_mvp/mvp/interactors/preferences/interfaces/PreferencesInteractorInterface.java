package com.instanect.aks_mvp.mvp.interactors.preferences.interfaces;

/**
 * Created by AKS on 10/26/2017.
 */

public interface PreferencesInteractorInterface {
    PreferencesInterface getPreferencesInterface();

    void setPreferencesInterface(PreferencesInterface preferencesInterface);

    PreferencesInteractorResponseInterface getPreferencesInteractorResponseInterface();

    void setPreferencesInteractorResponseInterface(PreferencesInteractorResponseInterface preferencesInteractorResponseInterface);
}
