package com.instanect.aks_mvp.mvp.interactors.extractor.di;


import com.instanect.mainapp.layers.business.mvp.interactors.extractor.ExtractorInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = ExtractorInteractorBuilderModule.class)
public interface ExtractorInteractorBuilderComponent {
    ExtractorInteractorBuilder provideExtractorInteractorBuilder();
}
