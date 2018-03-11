package com.instanect.aks_mvp.mvp.interactors.serverDataConverter.interfaces;

import java.util.HashMap;

/**
 * Converter Response Interface
 */

public interface LocalToServerDataConverterInteractorResponseInterface {
    void onConversionSuccess(HashMap<String, String> hashMap);
}
