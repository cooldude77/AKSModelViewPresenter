package com.instanect.aks_mvp.mvp.interactors.alert;

import androidx.appcompat.app.AlertDialog;

/**
 * Created by AKS on 3/11/2018.
 */

public interface GenericAlertDialogBuilderInterface {
    AlertDialog getGenericRESTFailureAlertDialog(String failureMessage);

    AlertDialog getGeneralOkMessageAlertDialog(String errorMessage);

    AlertDialog getInternetNotAvailable();

    AlertDialog getAdditionalUrlNotAvailableAlertDialog(String messageOnNotAvailable);
}
