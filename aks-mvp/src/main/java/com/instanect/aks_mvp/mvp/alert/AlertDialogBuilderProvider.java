package com.instanect.aks_mvp.mvp.alert;

import android.content.Context;
import android.support.v7.app.AlertDialog;

/**
 * Created by AKS on 12/28/2017.
 */

public class AlertDialogBuilderProvider {

    public AlertDialog.Builder getBuilderV7(Context context) {
        return new AlertDialog.Builder(context);
    }

    public android.app.AlertDialog.Builder getBuilder(Context context) {
        return new android.app.AlertDialog.Builder(context);
    }

}
