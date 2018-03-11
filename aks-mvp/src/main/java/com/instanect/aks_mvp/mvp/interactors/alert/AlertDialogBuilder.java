package com.instanect.aks_mvp.mvp.interactors.alert;

import java.lang.reflect.InvocationTargetException;

/**
 * Interactor Builder for AlertDialogInteractor
 */

public class AlertDialogBuilder {


    public AlertDialogInteractorInterface getInstance(
            Class<? extends AlertDialogInteractorInterface> cAlertDialogInteractorInterface,
            AppResourceGetterInterface appResourceGetterInterface,
            GenericAlertDialogBuilderInterface genericAlertDialogBuilderInterface)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class[] arguments = new Class[2];

        arguments[0] = AppResourceGetterInterface.class;
        arguments[1] = genericAlertDialogBuilderInterface.getClass();

        return cAlertDialogInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(appResourceGetterInterface, genericAlertDialogBuilderInterface);

    }

}
