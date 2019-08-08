package com.instanect.aks_mvp.mvp.alert.interfaces.neutral;

import android.view.View;

import com.instanect.aks_mvp.mvp.alert.interfaces.GenericAlertDialogViewResponseInterface;

/**
 * Created by AKS on 10/12/2017.
 */

public interface GenericAlertDialogViewWithNeutralResponseInterface
        extends GenericAlertDialogViewResponseInterface {
    void onNeutralButtonPressed(int alertCode, View view, Object t);
}
