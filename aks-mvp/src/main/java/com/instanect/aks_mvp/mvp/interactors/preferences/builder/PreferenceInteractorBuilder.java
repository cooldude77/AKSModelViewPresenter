package com.instanect.aks_mvp.mvp.interactors.preferences.builder;

import android.content.Context;

import com.google.gson.Gson;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.AppPreferences;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.interfaces.PreferenceInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/26/2017.
 */

public class PreferenceInteractorBuilder {
    private Context context;
    private Gson gson;

    public PreferenceInteractorBuilder(Context context, Gson gson) {

        this.context = context;
        this.gson = gson;
    }

    public <T> PreferenceInteractorInterface getInstance(
            Class<? extends PreferenceInteractorInterface> classInteractor,
            Class<? extends AppPreferences> preferenceClass)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {


        // create preference class
        Class[] args = new Class[2];

        args[0] = Context.class;
        args[1] = Gson.class;

        AppPreferences appPreferences
                = preferenceClass.getDeclaredConstructor(args)
                .newInstance(context, gson);

        // now create interactor
        Class[] arguments = new Class[1];
        arguments[0] = appPreferences.getClass();

        //return new EditOwnDataSaveOfflinePreferencesInteractor((EditOwnDataSaveOfflinePreferences)appPreferences);
        return classInteractor
                .getDeclaredConstructor(arguments)
                .newInstance(appPreferences);
    }
}