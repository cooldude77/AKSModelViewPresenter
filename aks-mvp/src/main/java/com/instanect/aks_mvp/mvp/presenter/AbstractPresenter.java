package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.file.interfaces.FileInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterResponseInterface;

/**
 * Abs class to be extended by all presenters
 */

public abstract class AbstractPresenter implements PresenterInterface {


    private DatabaseInteractorInterface databaseInteractorInterface;
    private ExtractorInteractorInterface extractorInteractorInterface;
    private NetworkInteractorInterface networkInteractorInterface;
    private PreferencesInteractorInterface preferencesInteractorInterface;
    private BusinessLogicInteractorInterface businessLogicInteractorInterface;
    private PresenterResponseInterface presenterResponseInterface;
    private FileInteractorInterface fileInteractorInterface;

    @Override
    public void setPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface) {

        this.presenterResponseInterface = presenterResponseInterface;
    }

    @Override
    public PresenterResponseInterface getPresenterResponseInterface() {
        return presenterResponseInterface;
    }

    @Override
    public DatabaseInteractorInterface getDatabaseInteractorInterface() {
        return databaseInteractorInterface;
    }

    @Override
    public void setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface) {
        this.databaseInteractorInterface = databaseInteractorInterface;
    }

    @Override
    public ExtractorInteractorInterface getExtractorInteractorInterface() {
        return extractorInteractorInterface;
    }

    @Override
    public void setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface) {
        this.extractorInteractorInterface = extractorInteractorInterface;
    }

    @Override
    public NetworkInteractorInterface getNetworkInteractorInterface() {
        return networkInteractorInterface;
    }

    @Override
    public void setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface) {
        this.networkInteractorInterface = networkInteractorInterface;
    }

    @Override
    public PreferencesInteractorInterface getPreferencesInteractorInterface() {
        return preferencesInteractorInterface;
    }

    @Override
    public void setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface) {
        this.preferencesInteractorInterface = preferencesInteractorInterface;
    }

    @Override
    public BusinessLogicInteractorInterface getBusinessLogicInteractorInterface() {
        return businessLogicInteractorInterface;
    }

    @Override
    public void setBusinessLogicInteractorInterface(BusinessLogicInteractorInterface businessLogicInteractorInterface) {
        this.businessLogicInteractorInterface = businessLogicInteractorInterface;
    }

    @Override
    public FileInteractorInterface getFileInteractorInterface() {
        return fileInteractorInterface;
    }

    @Override
    public void setFileInteractorInterface(FileInteractorInterface fileInteractorInterface) {
        this.fileInteractorInterface = fileInteractorInterface;
    }
}
