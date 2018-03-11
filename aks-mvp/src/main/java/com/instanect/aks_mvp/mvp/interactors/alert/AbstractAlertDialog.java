package com.instanect.aks_mvp.mvp.interactors.alert;


import android.content.Context;
import android.support.v7.app.AlertDialog;

import static junit.framework.Assert.assertNotNull;

/**
 * AbstractAlertDialogInteractor
 */

abstract public class AbstractAlertDialog implements AlertDialogInteractorInterface,
        GenericAlertDialogBuilderInterface {
    protected final AppResourceGetterInterface appResourceGetterInterface;
    protected final GenericAlertDialogBuilderInterface genericAlertDialogBuilderInterface;
    protected AlertDialogResponseInterface alertDialogResponseInterface;
    private Context activityContext;

    public AbstractAlertDialog(AppResourceGetterInterface appResourceGetterInterface,
                               GenericAlertDialogBuilderInterface genericAlertDialogBuilderInterface) {
        this.appResourceGetterInterface = appResourceGetterInterface;

        this.genericAlertDialogBuilderInterface = genericAlertDialogBuilderInterface;
    }

    public Context getActivityContext() {
        return activityContext;
    }

    public void setActivityContext(Context activityContext) {

        this.activityContext = activityContext;
    }

    public String getString(int resId) {
        return appResourceGetterInterface
                .getResourceString(resId);
    }

    @Override
    public void onPositiveButtonClicked(int alertCode) {

        assertNotNull(alertDialogResponseInterface);
        alertDialogResponseInterface.alertDialogPositiveButtonClicked(alertCode);
    }

    @Override
    public void onNegativeButtonClicked(int alertCode) {
        assertNotNull(alertDialogResponseInterface);
        alertDialogResponseInterface.alertDialogNegativeButtonClicked(alertCode);
    }

    public void showGeneralOkMessage(String errorMessage) {

        assertNotNull(getActivityContext());
        AlertDialog alertDialog = genericAlertDialogBuilderInterface
        .getGeneralOkMessageAlertDialog(errorMessage);
        alertDialog.show();

    }

    public AlertDialogResponseInterface getAlertDialogResponseInterface() {
        return alertDialogResponseInterface;
    }

    @Override
    public void setAlertDialogResponseInterface(AlertDialogResponseInterface alertDialogResponseInterface) {
        this.alertDialogResponseInterface = alertDialogResponseInterface;
    }
}


