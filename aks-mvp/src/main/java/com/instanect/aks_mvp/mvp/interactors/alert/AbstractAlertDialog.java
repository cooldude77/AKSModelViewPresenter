package com.instanect.aks_mvp.mvp.interactors.alert;

import android.content.Context;
import android.support.v7.app.AlertDialog;

import com.instanect.mainapp.R;
import com.instanect.mainapp.layers.business.generic.resources.AppResourceGetter;
import com.instanect.mainapp.layers.ui.alert.GenericAlertDialogBuilder;
import com.instanect.mainapp.layers.ui.alert.GenericAlertDialogResponseInterface;

import static junit.framework.Assert.assertNotNull;

/**
 * AbstractAlertDialogInteractor
 */

abstract public class AbstractAlertDialog implements AlertDialogInteractorInterface,
        GenericAlertDialogResponseInterface {
    protected final AppResourceGetter appResourceGetter;
    protected final GenericAlertDialogBuilder genericAlertDialogBuilder;
    protected AlertDialogResponseInterface alertDialogResponseInterface;
    private Context activityContext;

    public AbstractAlertDialog(AppResourceGetter appResourceGetter,
                               GenericAlertDialogBuilder genericAlertDialogBuilder) {
        this.appResourceGetter = appResourceGetter;

        this.genericAlertDialogBuilder = genericAlertDialogBuilder;
    }

    public Context getActivityContext() {
        return activityContext;
    }

    public void setActivityContext(Context activityContext) {

        this.activityContext = activityContext;
    }

    public String getString(int resId) {
        return appResourceGetter
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
        AlertDialog alertDialog = genericAlertDialogBuilder
                .builder(activityContext)
                .setTitle(getString(R.string.alert_general_error_title))
                .setMessage(errorMessage)
                .setPositiveButtonText(getString(R.string.common_ok))
                .build();

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


