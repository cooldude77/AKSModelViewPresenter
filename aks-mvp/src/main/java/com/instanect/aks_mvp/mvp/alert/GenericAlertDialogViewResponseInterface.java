package com.instanect.aks_mvp.mvp.alert;

import android.view.View;

/**
 * Created by AKS on 10/12/2017.
 */

public interface GenericAlertDialogViewResponseInterface {

    void onPositiveButtonClicked(int alertCode, View view);

    void onNegativeButtonClicked(int alertCode, View view);
}
