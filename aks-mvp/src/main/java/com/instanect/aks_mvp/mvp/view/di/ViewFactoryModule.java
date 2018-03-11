package com.instanect.aks_mvp.mvp.view.di;

import com.instanect.mainapp.layers.business.mvp.view.factory.ViewFactory;

import dagger.Module;
import dagger.Provides;

/**
 * ViewFactoryModule
 */
@Module
public class ViewFactoryModule {

    @Provides
    ViewFactory provideViewFactory() {
        return new ViewFactory();
    }
}
