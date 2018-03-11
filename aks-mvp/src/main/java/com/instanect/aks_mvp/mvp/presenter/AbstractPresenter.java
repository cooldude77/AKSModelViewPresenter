package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.mainapp.features.signup.form.PresenterNetworkResponseInterface;
import com.instanect.mainapp.features.signup.form.PresenterResponseInterface;
import com.instanect.mainapp.layers.business.database.DatabaseObjectInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.alert.AbstractAlertDialog;
import com.instanect.mainapp.layers.business.mvp.interactors.database.AbstractDatabaseInteractor;
import com.instanect.mainapp.layers.business.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.extractor.AbstractExtractorInteractor;
import com.instanect.mainapp.layers.business.mvp.interactors.extractor.ExtractorInteractorResponseInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.network.AbstractNetworkInteractor;
import com.instanect.mainapp.layers.business.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.AbstractPreferencesInteractor;
import com.instanect.mainapp.layers.business.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.mainapp.layers.business.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.mainapp.layers.business.mvp.view.interfaces.ViewInterface;
import com.instanect.restvolley.newNetwork.common.responseObject.NetworkResponse;

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
    private ViewInterface view;

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

    public AbstractPresenter(AbstractExtractorInteractor extractorInteractor,
                             AbstractNetworkInteractor networkInteractor) {
        this(null, extractorInteractor, networkInteractor, null);
    }

    public AbstractPresenter(AbstractDatabaseInteractor databaseInteractor, AbstractPreferencesInteractor preferenceInteractor) {

        this(databaseInteractor, null, null, null);
    }

    public AbstractPresenter(
            AbstractAlertDialog alertDialogInteractor,
            AbstractDatabaseInteractor databaseInteractor,
            AbstractPreferencesInteractor preferenceInteractor) {

        this(databaseInteractor, null, null, preferenceInteractor);
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
    public void attachView(ViewInterface viewInterface) {

        this.view = viewInterface;
    }

    public ViewInterface getView() {
        return view;
    }

    @Override
    public void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface) {

    }


    @Override
    public void onPreferencesSaveSuccess() {

    }


    @Override
    public void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode) {

        assert presenterResponseInterface instanceof PresenterNetworkResponseInterface;

        ((PresenterNetworkResponseInterface) presenterResponseInterface)
                .onRESTCallFailure(failureMessages, errorCode);

    }


    @Override
    public void onInternetNotAvailable() {
        assert presenterResponseInterface instanceof PresenterNetworkResponseInterface;

        ((PresenterNetworkResponseInterface) presenterResponseInterface)
                .onInternetNotAvailable();
    }

    @Override
    public void onAdditionUrlNotAvailable(String messageOnNotAvailable) {
        ((PresenterNetworkResponseInterface) presenterResponseInterface)
                .onAdditionalUrlNotAvailable(messageOnNotAvailable);
    }

    @Override
    public void onNetworkCallAbort() {
        getView().hideProgressIndicator();
    }


    @Override
    public void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface) {

    }

    @Override
    public <T> void onNetworkInteractorCallSuccessful(NetworkResponse<T> networkResponse) {

    }

    @Override
    public void onDatabaseInteractorProcessFailure(String errorMessage) {

    }

}
