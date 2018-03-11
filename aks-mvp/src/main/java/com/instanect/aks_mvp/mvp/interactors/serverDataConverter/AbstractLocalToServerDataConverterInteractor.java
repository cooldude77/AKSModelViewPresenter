package com.instanect.aks_mvp.mvp.interactors.serverDataConverter;

import com.google.gson.Gson;
import com.instanect.mainapp.features.signup.form.PresenterResponseInterface;
import com.instanect.mainapp.layers.business.dataObjects.ServerDataToSendObjectInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.serverDataConverter.interfaces.LocalToServerDataConverterInteractorInterface;
import com.instanect.mainapp.layers.business.providers.hashmap.HashMapInterface;

import java.util.HashMap;

/**
 * Base Interactor for converting the data into json format before
 * sending it to server
 */

public class AbstractLocalToServerDataConverterInteractor implements
        LocalToServerDataConverterInteractorInterface {


    private final HashMapInterface hashMapInterface;
    private final Gson gson;

    protected PresenterResponseInterface
            localToServerDataConverterInteractorResponseInterface;

    public AbstractLocalToServerDataConverterInteractor(HashMapInterface hashMapInterface,
                                                        Gson gson) {

        this.hashMapInterface = hashMapInterface;
        this.gson = gson;
    }

    protected HashMap<String, String> convert(
            ServerDataToSendObjectInterface serverDataToSendObjectInterface,
            String key) {

        String jsonString
                = gson.toJson(serverDataToSendObjectInterface);

        HashMap<String, String> hashMap = hashMapInterface.getHashMap();

        hashMap.put(key, jsonString);
        return hashMap;
    }

    public void setConverterInteractorResponseInterface(
            PresenterResponseInterface converterInteractorResponseInterface) {
        this.localToServerDataConverterInteractorResponseInterface = converterInteractorResponseInterface;
    }

}
