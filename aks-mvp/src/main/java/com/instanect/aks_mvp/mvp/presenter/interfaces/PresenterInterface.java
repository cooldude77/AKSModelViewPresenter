package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.presenter.InteractorResponseInterface;

/**
 * PresenterInterface.
 */

public interface PresenterInterface extends BasePresenterInterface, InteractorResponseInterface {

    void setAccountInteractorInterface(AccountInteractorInterface accountInteractorInterface);

    void setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface);

    void setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface);

    void setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface);

    void setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface);

    void attachPresenterResponseInterface(PresenterResponseInterface presenterResponseInterface);

}
