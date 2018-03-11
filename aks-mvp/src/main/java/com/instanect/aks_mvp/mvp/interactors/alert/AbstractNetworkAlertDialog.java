package com.instanect.aks_mvp.mvp.interactors.alert;

import android.support.v7.app.AlertDialog;

import com.instanect.mainapp.R;
import com.instanect.mainapp.layers.business.generic.resources.AppResourceGetter;
import com.instanect.mainapp.layers.ui.alert.GenericAlertDialogBuilder;

/**
 * Created by AKS on 12/31/2017.
 */

abstract public class AbstractNetworkAlertDialog extends AbstractAlertDialog {
    public final static int ALERT_CODE_REST_ERROR = 10;
    public final static int ALERT_CODE_INTERNET_NOT_AVAILABLE = 20;
    public final static int ALERT_CODE_ADDITIONAL_URL_NOT_AVAILABLE = 30;

    public AbstractNetworkAlertDialog(AppResourceGetter appResourceGetter, GenericAlertDialogBuilder genericAlertDialogBuilder) {
        super(appResourceGetter, genericAlertDialogBuilder);
    }

    public void showGenericRESTFailureAlertMessage(String failureMessage) {

        AlertDialog alertDialog = genericAlertDialogBuilder
                .builder(getActivityContext())
                .setTitle(getString(R.string.alert_signup_server_error_title))
                .setMessage(failureMessage)
                .setPositiveButtonText(getString(R.string.common_ok))
                .setResponse(this, ALERT_CODE_REST_ERROR)
                .build();

        alertDialog.show();

    }


    public void showInternetNotAvailable() {
        AlertDialog alertDialog = genericAlertDialogBuilder
                .builder(getActivityContext())
                .setTitle(getString(R.string.network_no_internet_found_title))
                .setMessage(getString(R.string.network_no_internet_found_message))
                .setResponse(this, ALERT_CODE_INTERNET_NOT_AVAILABLE)
                .setPositiveButtonText(getString(R.string.common_ok))
                .build();

        alertDialog.show();

    }

    public void showAdditionalUrlNotAvailable(String messageOnNotAvailable) {
        AlertDialog alertDialog = genericAlertDialogBuilder
                .builder(getActivityContext())
                .setTitle(getString(R.string.network_no_instanect_found_title))
                .setMessage(getString(R.string.network_no_instanect_found_message))
                .setResponse(this, ALERT_CODE_ADDITIONAL_URL_NOT_AVAILABLE)
                .setPositiveButtonText(getString(R.string.common_ok))
                .build();

        alertDialog.show();

    }

}
