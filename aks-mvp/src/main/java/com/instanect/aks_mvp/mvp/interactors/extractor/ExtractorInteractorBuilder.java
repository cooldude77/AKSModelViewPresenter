package com.instanect.aks_mvp.mvp.interactors.extractor;

import com.google.gson.Gson;
import com.instanect.mainapp.layers.network.rest.resolver.CurieResolver;
import com.instanect.mainapp.layers.network.rest.travelProcessors.extractors.ExtractorInterface;
import com.instanect.mainapp.layers.network.rest.travelProcessors.extractors.UserObjectExtractorFromJson;

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

        ExtractorInterface extractorInterface = null;
        if (classExtractorInterface.equals(UserObjectExtractorFromJson.class)) {
            extractorInterface = new UserObjectExtractorFromJson(new CurieResolver(),
                    new Gson());
            arguments[0] = UserObjectExtractorFromJson.class;

        }

        return cInterface
                .getDeclaredConstructor(arguments)
                .newInstance(extractorInterface);

    }


}
