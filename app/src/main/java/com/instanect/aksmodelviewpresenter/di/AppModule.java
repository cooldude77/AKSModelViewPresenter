package com.instanect.aksmodelviewpresenter.di;

import com.instanect.aks_mvp.mvp.presenter.PresenterBuilder;
import com.instanect.aksmodelviewpresenter.classes.AccountCreate;
import com.instanect.aksmodelviewpresenter.classes.AccountQuery;
import com.instanect.aksmodelviewpresenter.classes.AccountUpdaate;
import com.instanect.aksmodelviewpresenter.classes.DatabaseApi;
import com.instanect.aksmodelviewpresenter.classes.Extractor;
import com.instanect.aksmodelviewpresenter.classes.NetworkApi;
import com.instanect.aksmodelviewpresenter.classes.Preferences;
import com.instanect.aksmodelviewpresenter.interactors.AccountInteractor;
import com.instanect.aksmodelviewpresenter.interactors.DatabaseInteractor;
import com.instanect.aksmodelviewpresenter.interactors.ExtractorInteractor;
import com.instanect.aksmodelviewpresenter.interactors.NetworkInteractor;
import com.instanect.aksmodelviewpresenter.interactors.PreferencesInteractor;
import com.instanect.aksmodelviewpresenter.presenter.MVPPresenter;

import java.lang.reflect.InvocationTargetException;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 3/28/2018.
 */
@Module
public class AppModule {

    @Provides
    MVPPresenter provideMVPPresenter() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        AccountInteractor accountInteractor
                = new AccountInteractor(
                new AccountCreate(),
                new AccountUpdaate(),
                new AccountQuery()
        );

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


        return (MVPPresenter) new PresenterBuilder()
                .setAccountInteractorInterface(accountInteractor)
                .setDatabaseInteractorInterface(databaseInteractor)
                .setExtractorInteractorInterface(extractorInteractor)
                .setNetworkInteractorInterface(networkInteractor)
                .setPreferencesInteractorInterface(preferencesInteractor)
                .build();


    }

}
