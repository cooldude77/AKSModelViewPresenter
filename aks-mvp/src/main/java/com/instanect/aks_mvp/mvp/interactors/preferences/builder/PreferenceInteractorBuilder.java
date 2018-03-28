package com.instanect.aks_mvp.mvp.interactors.preferences.builder;

import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/26/2017.
 */

public class PreferenceInteractorBuilder {

    public <T> PreferencesInteractorInterface getInstance(
            Class<? extends PreferencesInteractorInterface> classInteractor,
            PreferencesInterface preferencesInterface)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        // now create interactor
        Class[] arguments = new Class[1];
        arguments[0] = preferencesInterface.getClass();

        return classInteractor
                .getDeclaredConstructor(arguments)
                .newInstance(preferencesInterface);
    }
}