package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;


/**
 * PresenterInterface.
 */

public interface PresenterInterface extends BasePresenterInterface {

    void setAccountInteractorInterface(AccountInteractorInterface accountInteractorInterface);

    void setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface);

    void setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface);

    void setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface);

    void setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface);

    void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface);

}
