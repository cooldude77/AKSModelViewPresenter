package com.instanect.aks_mvp.mvp.interactors.serverDataConverter.builder;

import android.util.Log;

import com.google.gson.Gson;
import com.instanect.mainapp.layers.business.mvp.interactors.serverDataConverter.interfaces.LocalToServerDataConverterInteractorInterface;
import com.instanect.mainapp.layers.business.providers.hashmap.HashMapProvider;
import com.instanect.mainapp.layers.business.util.LogTagGenerator;

import java.lang.reflect.InvocationTargetException;

/**
 * LocalToServerDataConverterInteractorBuilder
 */

public class LocalToServerDataConverterInteractorBuilder {
    private final String TAG = LogTagGenerator.getTag(LocalToServerDataConverterInteractorBuilder.class);

    public LocalToServerDataConverterInteractorInterface getInstance(
            Class<? extends LocalToServerDataConverterInteractorInterface> classInteractor,
            HashMapProvider hashMapProvider,
            Gson gson) {

        try {
            // create preference class
            Class[] args = new Class[2];

            args[0] = HashMapProvider.class;
            args[1] = Gson.class;

            return classInteractor.getDeclaredConstructor(args)
                    .newInstance(hashMapProvider, gson);


        } catch (InstantiationException e) {
            Log.d(TAG, Log.getStackTraceString(e));
        } catch (IllegalAccessException e) {
            Log.d(TAG, Log.getStackTraceString(e));
        } catch (InvocationTargetException e) {
            Log.d(TAG, Log.getStackTraceString(e));
        } catch (NoSuchMethodException e) {
            Log.d(TAG, Log.getStackTraceString(e));
        }
        return null;
    }
}
