package com.instanect.aks_mvp.mvp.alert.interfaces;

import android.view.View;

import com.instanect.aks_mvp.mvp.alert.interfaces.base.GenericAlertDialogBaseResponseInterface;

/**
 * Created by AKS on 10/12/2017.
 */

public interface GenericAlertDialogViewResponseInterface extends GenericAlertDialogBaseResponseInterface {

    void onPositiveButtonClicked(int alertCode, View view, Object t);

    void onNegativeButtonClicked(int alertCode, View view, Object t);
}
