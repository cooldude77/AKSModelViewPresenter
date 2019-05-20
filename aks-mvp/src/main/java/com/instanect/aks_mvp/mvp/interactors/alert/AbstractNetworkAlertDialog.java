package com.instanect.aks_mvp.mvp.interactors.alert;

import androidx.appcompat.app.AlertDialog;


/**
 * Created by AKS on 12/31/2017.
 */

abstract public class AbstractNetworkAlertDialog extends AbstractAlertDialog {
    public final static int ALERT_CODE_REST_ERROR = 10;
    public final static int ALERT_CODE_INTERNET_NOT_AVAILABLE = 20;
    public final static int ALERT_CODE_ADDITIONAL_URL_NOT_AVAILABLE = 30;

    public AbstractNetworkAlertDialog(AppResourceGetterInterface appResourceGetterInterface,
                                      GenericAlertDialogBuilderInterface genericAlertDialogBuilderInterface) {
        super(appResourceGetterInterface, genericAlertDialogBuilderInterface);
    }

    public void showGenericRESTFailureAlertMessage(String failureMessage) {
        AlertDialog alertDialog = genericAlertDialogBuilderInterface
                .getGenericRESTFailureAlertDialog(failureMessage);
    }


    public void showInternetNotAvailable() {
        AlertDialog alertDialog = genericAlertDialogBuilderInterface.getInternetNotAvailable();
        alertDialog.show();

    }

    public void showAdditionalUrlNotAvailable(String messageOnNotAvailable) {
        AlertDialog alertDialog = genericAlertDialogBuilderInterface
                .getAdditionalUrlNotAvailableAlertDialog(messageOnNotAvailable);

        alertDialog.show();

    }

}
