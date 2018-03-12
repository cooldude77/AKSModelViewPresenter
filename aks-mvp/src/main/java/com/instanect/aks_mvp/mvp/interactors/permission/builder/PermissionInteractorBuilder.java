package com.instanect.aks_mvp.mvp.interactors.permission.builder;


import com.instanect.aks_mvp.mvp.interactors.permission.interfaces.PermissionInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.permission.interfaces.PermissionInteractorResponseInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/5/2017.
 */

public class PermissionInteractorBuilder {


    public PermissionInteractorInterface getInstance(
            Class<? extends PermissionInteractorInterface> cPermissionInterface,
            PermissionInteractorResponseInterface permissionResponseInterface) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class[] arguments = new Class[1];
        arguments[0] = permissionResponseInterface.getClass();

        return cPermissionInterface
                .getDeclaredConstructor(arguments)
                .newInstance(permissionResponseInterface);
    }
}
