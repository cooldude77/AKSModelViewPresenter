package com.instanect.aks_mvp.mvp.interactors.preferences.di;

import android.content.Context;

import com.instanect.aks_mvp.mvp.interactors.preferences.builder.PreferenceInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/26/2017.
 */

@Module
public class PreferenceInteractorBuilderModule {


    @Provides
    public PreferenceInteractorBuilder providePreferenceInteractorBuilder() {
        return new PreferenceInteractorBuilder();
    }
}
