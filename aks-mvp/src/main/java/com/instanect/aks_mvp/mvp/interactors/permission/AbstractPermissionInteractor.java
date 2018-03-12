package com.instanect.aks_mvp.mvp.interactors.permission;


import com.instanect.aks_mvp.mvp.interactors.permission.interfaces.PermissionInteractorResponseInterface;

/**
 * Created by AKS on 10/9/2017.
 */

public class AbstractPermissionInteractor {
    private PermissionInteractorResponseInterface responseInterface;

    public AbstractPermissionInteractor(PermissionInteractorResponseInterface responseInterface) {

        this.responseInterface = responseInterface;
    }

    public PermissionInteractorResponseInterface getResponseInterface() {
        return responseInterface;
    }
}
