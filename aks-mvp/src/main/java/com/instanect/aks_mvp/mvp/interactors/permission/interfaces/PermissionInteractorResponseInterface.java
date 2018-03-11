package com.instanect.aks_mvp.mvp.interactors.permission.interfaces;

/**
 * Created by AKS on 10/6/2017.
 */

public interface PermissionInteractorResponseInterface {
    void onPermissionGranted();

    void onPermissionDenied();

    void showRationale();

    void onNeverAskAgain();
}
