package com.instanect.aks_mvp.mvp.alert.interfaces;

import com.instanect.aks_mvp.mvp.alert.interfaces.base.GenericAlertDialogBaseResponseInterface;

/**
 * Created by AKS on 10/12/2017.
 */

public interface GenericAlertDialogResponseInterface extends GenericAlertDialogBaseResponseInterface {
    void onPositiveButtonClicked(int alertCode, Object t);

    void onNegativeButtonClicked(int alertCode, Object t);
}
