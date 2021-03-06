package com.instanect.aksmodelviewpresenter.di;

import com.instanect.aks_mvp.mvp.presenter.PresenterBuilder;
import com.instanect.aksmodelviewpresenter.classes.BusinessLogic;
import com.instanect.aksmodelviewpresenter.classes.DatabaseApi;
import com.instanect.aksmodelviewpresenter.classes.Extractor;
import com.instanect.aksmodelviewpresenter.classes.NetworkApi;
import com.instanect.aksmodelviewpresenter.classes.Preferences;
import com.instanect.aksmodelviewpresenter.interactors.BusinessLogicInteractor;
import com.instanect.aksmodelviewpresenter.interactors.DatabaseInteractor;
import com.instanect.aksmodelviewpresenter.interactors.ExtractorInteractor;
import com.instanect.aksmodelviewpresenter.interactors.NetworkInteractor;
import com.instanect.aksmodelviewpresenter.interactors.PreferencesInteractor;
import com.instanect.aksmodelviewpresenter.presenter.MVPPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 3/28/2018.
 */
@Module
public class AppModule {

    @Provides
    MVPPresenter provideMVPPresenter() {

        DatabaseInteractor databaseInteractor
                = new DatabaseInteractor(
                new DatabaseApi()
        );

        ExtractorInteractor extractorInteractor
                = new ExtractorInteractor(
                new Extractor()
        );

        NetworkInteractor networkInteractor
                = new NetworkInteractor(
                new NetworkApi()
        );

        PreferencesInteractor preferencesInteractor
                = new PreferencesInteractor(new Preferences());

        BusinessLogicInteractor businessLogicInteractor
                = new BusinessLogicInteractor(new BusinessLogic());

        try {
            return (MVPPresenter) new PresenterBuilder()
                    .setPresenterClass(MVPPresenter.class)
                    .setDatabaseInteractorInterface(databaseInteractor)
                    .setExtractorInteractorInterface(extractorInteractor)
                    .setNetworkInteractorInterface(networkInteractor)
                    .setPreferencesInteractorInterface(preferencesInteractor)
                    .setBusinessLogicInteractorInterface(businessLogicInteractor)
                    .build();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;

    }

}
