package com.instanect.aks_mvp.mvp.interactors.alert;

/**
 * Created by AKS on 10/9/2017.
 */

public interface AlertDialogResponseInterface {

    void alertDialogPositiveButtonClicked(int alertCode);

    void alertDialogNegativeButtonClicked(int alertCode);
}
