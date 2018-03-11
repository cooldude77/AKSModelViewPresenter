package com.instanect.aks_mvp.mvp.interactors.preferences;

import com.instanect.mainapp.layers.business.mvp.interactors.preferences.interfaces.PreferenceInteractorInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;

/**
 * Created by AKS on 10/26/2017.
 */

abstract public class AbstractPreferencesInteractor implements PreferenceInteractorInterface {


    protected final AppPreferences appPreferences;
    protected PreferencesInteractorResponseInterface preferencesInteractorResponseInterface;

    public AbstractPreferencesInteractor(AppPreferences appPreferences) {


        this.appPreferences = appPreferences;
    }

    @Override
    public void setPreferencesInteractorResponseInterface(PreferencesInteractorResponseInterface preferencesInteractorResponseInterface) {
        this.preferencesInteractorResponseInterface = preferencesInteractorResponseInterface;
    }
}
