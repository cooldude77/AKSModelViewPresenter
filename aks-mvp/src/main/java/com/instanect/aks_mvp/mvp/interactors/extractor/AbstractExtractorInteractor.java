package com.instanect.aks_mvp.mvp.interactors.extractor;


/**
 * Created by AKS on 10/9/2017.
 */

abstract public class AbstractExtractorInteractor implements ExtractorInteractorInterface {
    protected final ExtractorInterface extractorInterface;
    protected ExtractorInteractorResponseInterface extractorInteractorResponseInterface;

    public AbstractExtractorInteractor(ExtractorInterface extractorInterface) {
        this.extractorInterface = extractorInterface;
    }

    @Override
    public void setExtractorInteractorResponseInterface(ExtractorInteractorResponseInterface extractorInteractorResponseInterface) {
        this.extractorInteractorResponseInterface = extractorInteractorResponseInterface;
    }
}
