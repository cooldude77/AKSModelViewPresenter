package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.database.AbstractDatabaseInteractor;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.AbstractExtractorInteractor;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.NetworkResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.AbstractNetworkInteractor;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.AbstractPreferencesInteractor;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterDatabaseResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterExtractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterNetworkResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterPreferencesResponseInterface;
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
    private PresenterDatabaseResponseInterface presenterDatabaseResponseInterface;
    private PresenterExtractorResponseInterface presenterExtractorResponseInterface;
    private PresenterNetworkResponseInterface presenterNetworkResponseInterface;
    private PresenterPreferencesResponseInterface presenterPreferencesResponseInterface;

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


        if (networkInteractor != null)
            this.presenterNetworkResponseInterface = (PresenterNetworkResponseInterface) presenterResponseInterface;
        if (extractorInteractor != null)
            this.presenterExtractorResponseInterface = (PresenterExtractorResponseInterface) presenterResponseInterface;
        if (databaseInteractor != null)
            this.presenterDatabaseResponseInterface = (PresenterDatabaseResponseInterface)presenterResponseInterface;
        if (preferencesInteractor != null)
            this.presenterPreferencesResponseInterface = (PresenterPreferencesResponseInterface)presenterResponseInterface;
    }

    public PresenterResponseInterface getPresenterResponseInterface() {
        return presenterResponseInterface;
    }


    @Override
    public void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface) {

        presenterDatabaseResponseInterface.onDatabaseInteractorProcessSuccess(databaseObjectInterface);
    }


    @Override
    public void onPreferencesSaveSuccess() {
        presenterPreferencesResponseInterface.onPreferenceSaveSuccess();
    }


    @Override
    public void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode) {

        presenterNetworkResponseInterface.onNetworkInteractorScenarioCallFailure(failureMessages, errorCode);
    }


    @Override
    public void onInternetNotAvailable() {
        presenterNetworkResponseInterface.onInternetNotAvailable();

    }

    @Override
    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable) {
        presenterNetworkResponseInterface.onAdditionalUrlNotAvailable(messageOnNotAvailable);
    }

    @Override
    public void onNetworkCallAbort() {

        presenterNetworkResponseInterface.onNetworkCallAbort();
    }


    @Override
    public void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface) {

        presenterExtractorResponseInterface.onExtractorSuccess(databaseObjectInterface);
    }

    @Override
    public <T> void onNetworkInteractorCallSuccessful(
            NetworkResponseInterface<T> networkResponseInterface) {

        presenterNetworkResponseInterface.onNetworkInteractorCallSuccessful(networkResponseInterface);
    }

    @Override
    public void onDatabaseInteractorProcessFailure(String errorMessage) {

        presenterDatabaseResponseInterface.onDatabaseInteractorProcessFailure(errorMessage);
    }

}
