package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterResponseInterface;

/**
 * Abs class to be extended by all presenters
 */

public abstract class AbstractPresenter implements PresenterInterface {


    private  AccountInteractorInterface accountInteractorInterface;
    private  DatabaseInteractorInterface databaseInteractorInterface;
    private  ExtractorInteractorInterface extractorInteractorInterface;
    private  NetworkInteractorInterface networkInteractorInterface;
    private  PreferencesInteractorInterface preferencesInteractorInterface;
    private PresenterResponseInterface presenterResponseInterface;

    public AbstractPresenter(){
        
    }
    public AbstractPresenter(
            AccountInteractorInterface accountInteractorInterface,
            DatabaseInteractorInterface databaseInteractorInterface,
            ExtractorInteractorInterface extractorInteractorInterface,
            NetworkInteractorInterface networkInteractorInterface,
            PreferencesInteractorInterface preferencesInteractorInterface) {

        this.accountInteractorInterface = accountInteractorInterface;
        this.databaseInteractorInterface = databaseInteractorInterface;
        this.extractorInteractorInterface = extractorInteractorInterface;
        this.networkInteractorInterface = networkInteractorInterface;
        this.preferencesInteractorInterface = preferencesInteractorInterface;

    }


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

    public DatabaseInteractorInterface getDatabaseInteractorInterface() {
        return databaseInteractorInterface;
    }

    public ExtractorInteractorInterface getExtractorInteractorInterface() {
        return extractorInteractorInterface;
    }

    public NetworkInteractorInterface getNetworkInteractorInterface() {
        return networkInteractorInterface;
    }

    public PreferencesInteractorInterface getPreferencesInteractorInterface() {
        return preferencesInteractorInterface;
    }

}
