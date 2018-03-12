package com.instanect.aks_mvp.mvp.interactors.preferences.builder;

import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.AppPreferencesInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferenceInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/26/2017.
 */

public class PreferenceInteractorBuilder {

    public <T> PreferenceInteractorInterface getInstance(
            Class<? extends PreferenceInteractorInterface> classInteractor,
            AppPreferencesInterface appPreferencesInterface)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        // now create interactor
        Class[] arguments = new Class[1];
        arguments[0] = appPreferencesInterface.getClass();

        return classInteractor
                .getDeclaredConstructor(arguments)
                .newInstance(appPreferencesInterface);
    }
}