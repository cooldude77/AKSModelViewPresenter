package com.instanect.aks_mvp.mvp.interactors.extractor;


import com.instanect.accountcommon.network.NetworkResponseInterface;

import org.json.JSONObject;

/**
 * Created by AKS on 10/7/2017.
 */

public interface ExtractorInteractorInterface {

    void extract(NetworkResponseInterface<JSONObject> networkResponse);

    void setExtractorInteractorResponseInterface(ExtractorInteractorResponseInterface extractorInteractorResponseInterface);
}
