package com.instanect.aks_mvp.mvp.interactors.extractor.di;



import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = ExtractorInteractorBuilderModule.class)
public interface ExtractorInteractorBuilderComponent {
    ExtractorInteractorBuilder provideExtractorInteractorBuilder();
}
