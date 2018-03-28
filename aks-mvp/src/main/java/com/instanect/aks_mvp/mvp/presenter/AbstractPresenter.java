package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterResponseInterface;

/**
 * Abs class to be extended by all presenters
 */

public abstract class AbstractPresenter implements PresenterInterface {


    private AccountInteractorInterface accountInteractorInterface;
    private DatabaseInteractorInterface databaseInteractorInterface;
    private ExtractorInteractorInterface extractorInteractorInterface;
    private NetworkInteractorInterface networkInteractorInterface;
    private PreferencesInteractorInterface preferencesInteractorInterface;
    private PresenterResponseInterface presenterResponseInterface;

    @Override
    public void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface) {

        this.presenterResponseInterface = presenterResponseInterface;
    }

    public PresenterResponseInterface getPresenterResponseInterface() {
        return presenterResponseInterface;
    }

    public AccountInteractorInterface getAccountInteractorInterface() {
        return accountInteractorInterface;
    }

    @Override
    public void setAccountInteractorInterface(AccountInteractorInterface accountInteractorInterface) {
        this.accountInteractorInterface = accountInteractorInterface;
    }

    public DatabaseInteractorInterface getDatabaseInteractorInterface() {
        return databaseInteractorInterface;
    }

    @Override
    public void setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface) {
        this.databaseInteractorInterface = databaseInteractorInterface;
    }

    public ExtractorInteractorInterface getExtractorInteractorInterface() {
        return extractorInteractorInterface;
    }

    @Override
    public void setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface) {
        this.extractorInteractorInterface = extractorInteractorInterface;
    }

    public NetworkInteractorInterface getNetworkInteractorInterface() {
        return networkInteractorInterface;
    }

    @Override
    public void setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface) {
        this.networkInteractorInterface = networkInteractorInterface;
    }

    public PreferencesInteractorInterface getPreferencesInteractorInterface() {
        return preferencesInteractorInterface;
    }

    @Override
    public void setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface) {
        this.preferencesInteractorInterface = preferencesInteractorInterface;
    }

}
