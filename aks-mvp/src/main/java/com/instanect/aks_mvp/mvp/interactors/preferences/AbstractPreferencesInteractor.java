package com.instanect.aks_mvp.mvp.interactors.preferences;


import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInterface;

/**
 * Created by AKS on 10/26/2017.
 */

abstract public class AbstractPreferencesInteractor implements PreferencesInteractorInterface {


    private PreferencesInterface preferencesInterface;
    private PreferencesInteractorResponseInterface preferencesInteractorResponseInterface;

    public AbstractPreferencesInteractor(PreferencesInterface preferencesInterface) {


        this.preferencesInterface = preferencesInterface;
    }

    public PreferencesInterface getPreferencesInterface() {
        return preferencesInterface;
    }

    public void setPreferencesInterface(PreferencesInterface preferencesInterface) {
        this.preferencesInterface = preferencesInterface;
    }

    public PreferencesInteractorResponseInterface getPreferencesInteractorResponseInterface() {
        return preferencesInteractorResponseInterface;
    }

    @Override
    public void setPreferencesInteractorResponseInterface(PreferencesInteractorResponseInterface preferencesInteractorResponseInterface) {
        this.preferencesInteractorResponseInterface = preferencesInteractorResponseInterface;
    }
}
