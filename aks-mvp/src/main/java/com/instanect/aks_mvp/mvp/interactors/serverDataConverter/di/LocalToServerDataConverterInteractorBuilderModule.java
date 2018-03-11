package com.instanect.aks_mvp.mvp.interactors.serverDataConverter.di;


import android.content.Context;

import com.instanect.mainapp.layers.business.mvp.interactors.serverDataConverter.builder.LocalToServerDataConverterInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Module for AlertDialogInteractorBuilder
 */

@Module
public class LocalToServerDataConverterInteractorBuilderModule {

    private Context context;

    public LocalToServerDataConverterInteractorBuilderModule(Context context) {

        this.context = context;
    }

    @Provides
    public LocalToServerDataConverterInteractorBuilder
    provideLocalToServerDataConverterInteractorBuilder() {
        return new LocalToServerDataConverterInteractorBuilder();
    }

}
