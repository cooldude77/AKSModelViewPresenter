package com.instanect.aks_mvp.mvp.interactors.alert.di;


import com.instanect.mainapp.layers.business.mvp.interactors.alert.AlertDialogBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = AlertDialogBuilderModule.class)
public interface AlertDialogInteractorBuilderComponent {
    AlertDialogBuilder provideAlertDialogInteractorBuilder();
}
