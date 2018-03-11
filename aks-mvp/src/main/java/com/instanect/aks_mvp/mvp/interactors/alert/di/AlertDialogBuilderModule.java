package com.instanect.aks_mvp.mvp.interactors.alert.di;


import android.content.Context;

import com.instanect.mainapp.layers.business.mvp.interactors.alert.AlertDialogBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Module for AlertDialogInteractorBuilder
 */

@Module
public class AlertDialogBuilderModule {

    private Context context;

    public AlertDialogBuilderModule(Context context) {

        this.context = context;
    }

    @Provides
    public AlertDialogBuilder provideAlertDialogBuilder() {
        return new AlertDialogBuilder();
    }

}
