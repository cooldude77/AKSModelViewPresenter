package com.instanect.aks_mvp.mvp.interactors.preferences;


import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;

/**
 * Created by AKS on 10/26/2017.
 */

abstract public class AbstractPreferencesInteractor implements PreferencesInteractorInterface {


    protected PreferencesInterface preferencesInterface;
    protected PreferencesInteractorResponseInterface preferencesInteractorResponseInterface;

    public AbstractPreferencesInteractor(PreferencesInterface preferencesInterface) {


        this.preferencesInterface = preferencesInterface;
    }

    @Override
    public void setPreferencesInteractorResponseInterface(PreferencesInteractorResponseInterface preferencesInteractorResponseInterface) {
        this.preferencesInteractorResponseInterface = preferencesInteractorResponseInterface;
    }
}
