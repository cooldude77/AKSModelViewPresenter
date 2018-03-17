package com.instanect.aks_mvp;

import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.network.builder.NetworkInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.preferences.builder.PreferenceInteractorBuilder;
import com.instanect.aks_mvp.mvp.view.factory.ViewFactory;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

/**
 * Created by AKS on 3/16/2018.
 */
@Module
public class MockAKSMVPModule {

    ViewFactory viewFactory = mock(ViewFactory.class);

    NetworkInteractorBuilder networkInteractorBuilder = mock(NetworkInteractorBuilder.class);

    PreferenceInteractorBuilder preferenceInteractorBuilder
            = mock(PreferenceInteractorBuilder.class);

    ExtractorInteractorBuilder extractorInteractorBuilder
            = mock(ExtractorInteractorBuilder.class);
    DatabaseInteractorBuilder databaseInteractorBuilder
            = mock(DatabaseInteractorBuilder.class);

    @Provides
    ViewFactory provideViewFactory() {
        return viewFactory;
    }

    @Provides
    NetworkInteractorBuilder provideNetworkInteractorBuilder() {
        return networkInteractorBuilder;
    }

    @Provides
    PreferenceInteractorBuilder providePreferenceInteractorBuilder() {
        return preferenceInteractorBuilder;
    }

    @Provides
    ExtractorInteractorBuilder provideExtractorInteractorBuilder() {
        return extractorInteractorBuilder;
    }

    @Provides
    DatabaseInteractorBuilder provideDatabaseDatabaseInteractorBuilder() {
        return databaseInteractorBuilder;
    }

}
