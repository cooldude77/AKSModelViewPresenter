package com.instanect.aks_mvp.mvp.interactors.alert;

/**
 * Created by AKS on 10/7/2017.
 */

public interface AlertDialogInteractorInterface {
    void onPositiveButtonClicked(int alertCode);

    void onNegativeButtonClicked(int alertCode);

    void setAlertDialogResponseInterface(AlertDialogResponseInterface alertDialogResponseInterface);
}
