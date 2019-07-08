package com.instanect.aks_mvp.di;

import android.content.Context;

import com.google.gson.Gson;
import com.instanect.aks_mvp.mvp.alert.AlertDialogBuilderProvider;
import com.instanect.aks_mvp.mvp.alert.GenericAlertDialogBuilder;
import com.instanect.aks_mvp.mvp.helpers.PreferencesHelper;
import com.instanect.aks_mvp.mvp.interactors.account.builder.AccountInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.network.builder.NetworkInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.preferences.builder.PreferenceInteractorBuilder;
import com.instanect.aks_mvp.mvp.view.factory.ViewFactory;
import com.instanect.aks_mvp.mvp.view.helper.AppViewHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 3/13/2018.
 */
@Module
public class AKSMVPModule {

    private Context context;

    public AKSMVPModule(Context context) {
        this.context = context;
    }

    @Provides
    public AccountInteractorBuilder provideAccountInteractorBuilder() {
        return new AccountInteractorBuilder();
    }

    @Provides
    DatabaseInteractorBuilder provideDatabaseDatabaseInteractorBuilder() {
        return new DatabaseInteractorBuilder();
    }

    @Provides
    ExtractorInteractorBuilder provideExtractorInteractorBuilder() {
        return new ExtractorInteractorBuilder();
    }


    @Provides
    NetworkInteractorBuilder provideNetworkInteractorBuilder() {
        return new NetworkInteractorBuilder();
    }

    @Provides
    PreferenceInteractorBuilder providePreferenceInteractorBuilder() {
        return new PreferenceInteractorBuilder();
    }

    @Provides
    ViewFactory provideViewFactory() {
        return new ViewFactory();
    }

    @Provides
    PreferencesHelper providePreferencesHelper() {
        return new PreferencesHelper(context, new Gson());
    }

    @Provides
    GenericAlertDialogBuilder provideGenericAlertDialogBuilder() {
        return new GenericAlertDialogBuilder(new AlertDialogBuilderProvider());
    }


    @Provides
    AppViewHelper provideAppViewHelper() {
        return new AppViewHelper(context);
    }
}
