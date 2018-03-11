package com.instanect.aks_mvp.mvp.interactors.preferences.di;

import android.content.Context;

import com.google.gson.Gson;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.builder.PreferenceInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/26/2017.
 */

@Module
public class PreferenceInteractorBuilderModule {

    private Context context;
    private Gson gson;

    public PreferenceInteractorBuilderModule(Context context, Gson gson) {

        this.context = context;
        this.gson = gson;
    }

    @Provides
    public PreferenceInteractorBuilder providePreferenceInteractorBuilder() {
        return new PreferenceInteractorBuilder(context, gson);
    }
}
