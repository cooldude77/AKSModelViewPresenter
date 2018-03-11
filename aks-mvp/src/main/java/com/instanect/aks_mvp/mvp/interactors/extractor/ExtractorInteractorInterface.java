package com.instanect.aks_mvp.mvp.interactors.extractor;

import com.instanect.restvolley.newNetwork.common.responseObject.NetworkResponse;

import org.json.JSONObject;

/**
 * Created by AKS on 10/7/2017.
 */

public interface ExtractorInteractorInterface {

    void extract(NetworkResponse<JSONObject> networkResponse);

    void setExtractorInteractorResponseInterface(ExtractorInteractorResponseInterface extractorInteractorResponseInterface);
}
