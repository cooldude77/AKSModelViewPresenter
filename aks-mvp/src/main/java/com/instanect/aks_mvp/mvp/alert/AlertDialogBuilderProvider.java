package com.instanect.aks_mvp.mvp.alert;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;

/**
 * Created by AKS on 12/28/2017.
 */

public class AlertDialogBuilderProvider {

    public AlertDialog.Builder getBuilder(Context context) {
        return new AlertDialog.Builder(context);
    }

}
