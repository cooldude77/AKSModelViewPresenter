package com.instanect.aks_mvp.mvp.interactors.business.builder;

import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * BusinessLogicInteractorBuilder
 */

public class BusinessLogicInteractorBuilder {


    public BusinessLogicInteractorInterface getInstance(
            Class<? extends BusinessLogicInteractorInterface> classBusinessLogicInteractorInterface,
            BusinessLogicInterface businessLogicInterface)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class[] arguments = new Class[1];
        arguments[0] = businessLogicInterface.getClass();


        return classBusinessLogicInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(businessLogicInterface);

    }
}
