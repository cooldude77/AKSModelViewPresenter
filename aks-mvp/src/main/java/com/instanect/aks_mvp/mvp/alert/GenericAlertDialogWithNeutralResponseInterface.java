package com.instanect.aks_mvp.mvp.alert;

/**
 * Created by AKS on 10/12/2017.
 */

public interface GenericAlertDialogWithNeutralResponseInterface
        extends GenericAlertDialogResponseInterface {
    void onNeutralButtonPressed(int alertCode);
}
