package com.instanect.aks_mvp.mvp.interactors.extractor;


import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/7/2017.
 */

public class ExtractorInteractorBuilder {

    public ExtractorInteractorInterface getInstance(
            Class<? extends ExtractorInteractorInterface> cInterface,
            ExtractorInterface extractorInterface)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class[] arguments = new Class[1];
        arguments[0] = extractorInterface.getClass();

        return cInterface
                .getDeclaredConstructor(arguments)
                .newInstance(extractorInterface);

    }


}
