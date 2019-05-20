package com.instanect.aks_mvp.mvp.interactors;


import androidx.appcompat.app.AlertDialog;

import com.instanect.aks_mvp.mvp.interactors.alert.AbstractAlertDialog;
import com.instanect.aks_mvp.mvp.interactors.alert.AppResourceGetterInterface;
import com.instanect.aks_mvp.mvp.interactors.alert.GenericAlertDialogBuilderInterface;

/**
 * Created by AKS on 12/14/2017.
 */

public class GenericAlertDialogInteractor extends AbstractAlertDialog {
    public GenericAlertDialogInteractor(AppResourceGetterInterface appResourceGetterInterface,
                                        GenericAlertDialogBuilderInterface genericAlertDialogBuilder) {
        super(appResourceGetterInterface, genericAlertDialogBuilder);
    }

    @Override
    public AlertDialog getGenericRESTFailureAlertDialog(String failureMessage) {
        return null;
    }

    @Override
    public AlertDialog getGeneralOkMessageAlertDialog(String errorMessage) {
        return null;
    }

    @Override
    public AlertDialog getInternetNotAvailable() {
        return null;
    }

    @Override
    public AlertDialog getAdditionalUrlNotAvailableAlertDialog(String messageOnNotAvailable) {
        return null;
    }
}
