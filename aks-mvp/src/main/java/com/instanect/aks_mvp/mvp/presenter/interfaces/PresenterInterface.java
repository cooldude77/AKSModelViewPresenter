package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.file.interfaces.FileInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;


/**
 * PresenterInterface.
 */

public interface PresenterInterface extends BasePresenterInterface {

    void setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface);

    void setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface);

    void setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface);

    void setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface);

    DatabaseInteractorInterface getDatabaseInteractorInterface();

    ExtractorInteractorInterface getExtractorInteractorInterface();

    NetworkInteractorInterface getNetworkInteractorInterface();

    PreferencesInteractorInterface getPreferencesInteractorInterface();

    BusinessLogicInteractorInterface getBusinessLogicInteractorInterface();

    void setBusinessLogicInteractorInterface(BusinessLogicInteractorInterface businessLogicInteractorInterface);

    void setPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface);

    PresenterResponseInterface getPresenterResponseInterface();

    FileInteractorInterface getFileInteractorInterface();

    void setFileInteractorInterface(FileInteractorInterface fileInteractorInterface);
}
