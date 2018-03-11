package com.instanect.aks_mvp.mvp.interactors.extractor;


import java.lang.reflect.InvocationTargetException;

/**
 * Created by AKS on 10/7/2017.
 */

public class ExtractorInteractorBuilder {

    public ExtractorInteractorInterface getInstance(
            Class<? extends ExtractorInteractorInterface> cInterface,
            Class<? extends ExtractorInterface> classExtractorInterface)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class[] arguments = new Class[1];


        return cInterface
                .getDeclaredConstructor(arguments)
                .newInstance(null);

    }


}
