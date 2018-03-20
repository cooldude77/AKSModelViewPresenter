package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.NetworkResponseInterface;

/**
 * Created by AKS on 3/12/2018.
 */

public interface PresenterResponseInterface {
    void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface);

    void onPreferenceSaveSuccess();

    void onNetworkInteractorScenarioCallFailure(String failureMessages, int errorCode);

    void onInternetNotAvailable();

    void onAdditionalUrlNotAvailable(String messageOnNotAvailable);

    void onNetworkCallAbort();

    void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface);

    <T> void onNetworkInteractorCallSuccessful(NetworkResponseInterface<T> networkResponseInterface);

    void onDatabaseInteractorProcessFailure(String errorMessage);
}
