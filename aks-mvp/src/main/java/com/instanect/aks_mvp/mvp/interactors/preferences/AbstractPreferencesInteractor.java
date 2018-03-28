package com.instanect.aks_mvp.mvp.interactors.preferences;


import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.AppPreferencesInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;

/**
 * Created by AKS on 10/26/2017.
 */

abstract public class AbstractPreferencesInteractor implements PreferencesInteractorInterface {


    protected AppPreferencesInterface appPreferencesInterface;
    protected PreferencesInteractorResponseInterface preferencesInteractorResponseInterface;

    public AbstractPreferencesInteractor(AppPreferencesInterface appPreferencesInterface) {


        this.appPreferencesInterface = appPreferencesInterface;
    }

    @Override
    public void setPreferencesInteractorResponseInterface(PreferencesInteractorResponseInterface preferencesInteractorResponseInterface) {
        this.preferencesInteractorResponseInterface = preferencesInteractorResponseInterface;
    }
}
