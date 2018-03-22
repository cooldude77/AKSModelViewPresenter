package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.accountcommon.network.NetworkResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.AbstractDatabaseInteractor;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.AbstractExtractorInteractor;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.AbstractNetworkInteractor;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.AbstractPreferencesInteractor;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterResponseInterface;

/**
 * Abs class to be extended by all presenters
 */

public abstract class AbstractPresenter implements PresenterInterface,
        NetworkInteractorResponseInterface,
        ExtractorInteractorResponseInterface,
        DatabaseInteractorResponseInterface,
        PreferencesInteractorResponseInterface {

    protected final AbstractNetworkInteractor networkInteractor;
    protected final AbstractExtractorInteractor extractorInteractor;
    protected final AbstractDatabaseInteractor databaseInteractor;
    protected final AbstractPreferencesInteractor preferencesInteractor;

    private PresenterResponseInterface presenterResponseInterface;

    public AbstractPresenter(
            AbstractDatabaseInteractor databaseInteractor,
            AbstractExtractorInteractor extractorInteractor,
            AbstractNetworkInteractor networkInteractor,
            AbstractPreferencesInteractor preferencesInteractor) {
        this.networkInteractor = networkInteractor;
        this.extractorInteractor = extractorInteractor;
        this.databaseInteractor = databaseInteractor;
        this.preferencesInteractor = preferencesInteractor;
        attachPresenterAsResponseToInteractors();
    }

    @Override
    public void attachPresenterAsResponseToInteractors() {

        if (networkInteractor != null)
            networkInteractor.setNetworkInteractorResponseInterface(this);
        if (extractorInteractor != null)
            extractorInteractor.setExtractorInteractorResponseInterface(this);
        if (databaseInteractor != null)
            databaseInteractor.setDatabaseInteractorResponseInterface(this);
        if (preferencesInteractor != null)
            preferencesInteractor.setPreferencesInteractorResponseInterface(this);
    }

    @Override
    public void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface) {

        this.presenterResponseInterface = presenterResponseInterface;
    }

    public PresenterResponseInterface getPresenterResponseInterface() {
        return presenterResponseInterface;
    }


    @Override
    public void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface) {

    }


    @Override
    public void onPreferencesSaveSuccess() {
    }


    @Override
    public void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode) {
    }


    @Override
    public void onInternetNotAvailable() {

    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {
    }

    @Override
    public void onNetworkCallAbort() {

    }


    @Override
    public void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface) {

    }

    @Override
    public <T> void onNetworkInteractorCallSuccessful(
            NetworkResponseInterface<T> networkResponseInterface) {

    }

    @Override
    public void onDatabaseInteractorProcessFailure(String errorMessage) {
    }


}
