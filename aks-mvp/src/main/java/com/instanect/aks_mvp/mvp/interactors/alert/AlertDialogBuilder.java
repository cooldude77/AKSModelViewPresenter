package com.instanect.aks_mvp.mvp.interactors.alert;

import com.instanect.mainapp.layers.business.generic.resources.AppResourceGetter;
import com.instanect.mainapp.layers.ui.alert.GenericAlertDialogBuilder;

import java.lang.reflect.InvocationTargetException;

/**
 * Interactor Builder for AlertDialogInteractor
 */

public class AlertDialogBuilder {


    public AlertDialogInteractorInterface getInstance(
            Class<? extends AlertDialogInteractorInterface> cAlertDialogInteractorInterface,
            AppResourceGetter appResourceGetter,
            GenericAlertDialogBuilder genericAlertDialogBuilder)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class[] arguments = new Class[2];

        arguments[0] = AppResourceGetter.class;
        arguments[1] = genericAlertDialogBuilder.getClass();

        return cAlertDialogInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(appResourceGetter, genericAlertDialogBuilder);

    }

}
