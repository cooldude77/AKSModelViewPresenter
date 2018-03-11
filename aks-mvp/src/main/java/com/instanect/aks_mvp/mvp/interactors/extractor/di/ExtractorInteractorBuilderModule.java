package com.instanect.aks_mvp.mvp.interactors.extractor.di;


import com.instanect.mainapp.layers.business.mvp.interactors.extractor.ExtractorInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class ExtractorInteractorBuilderModule {

    @Provides
    public ExtractorInteractorBuilder provideExtractorInteractorBuilder() {
        return new ExtractorInteractorBuilder();
    }

}
