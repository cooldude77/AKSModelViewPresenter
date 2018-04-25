package com.instanect.aks_mvp.mvp.interactors.extractor;


import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInterface;
import com.instanect.networkcommon.NetworkResponseInterface;

import org.json.JSONObject;

/**
 * Created by AKS on 10/9/2017.
 */

abstract public class AbstractExtractorInteractor implements ExtractorInteractorInterface {
    private final ExtractorInterface extractorInterface;
    private ExtractorInteractorResponseInterface extractorInteractorResponseInterface;

    public AbstractExtractorInteractor(ExtractorInterface extractorInterface) {
        this.extractorInterface = extractorInterface;
    }

    @Override
    public void setExtractorInteractorResponseInterface(ExtractorInteractorResponseInterface extractorInteractorResponseInterface) {
        this.extractorInteractorResponseInterface = extractorInteractorResponseInterface;
    }


    @Override
    public ExtractorInterface getExtractorInterface() {
        return extractorInterface;
    }

    @Override
    public ExtractorInteractorResponseInterface getExtractorInteractorResponseInterface() {
        return extractorInteractorResponseInterface;
    }


    @Override
    public void extract(NetworkResponseInterface<JSONObject> networkResponse) {

    }
}
