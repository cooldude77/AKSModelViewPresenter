package com.instanect.aks_mvp.mvp.interactors.extractor.interfaces;


import com.instanect.networkcommon.NetworkResponseInterface;

import org.json.JSONObject;

/**
 * Created by AKS on 10/7/2017.
 */

public interface ExtractorInteractorInterface {

    void extract(NetworkResponseInterface<JSONObject> networkResponse);

    void setExtractorInteractorResponseInterface(ExtractorInteractorResponseInterface extractorInteractorResponseInterface);

    ExtractorInterface getExtractorInterface();

    ExtractorInteractorResponseInterface getExtractorInteractorResponseInterface();
}
