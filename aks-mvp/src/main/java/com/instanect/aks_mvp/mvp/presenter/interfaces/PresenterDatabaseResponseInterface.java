package com.instanect.aks_mvp.mvp.presenter.interfaces;

import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;

/**
 * Created by AKS on 3/12/2018.
 */

public interface PresenterDatabaseResponseInterface extends PresenterResponseInterface{
    void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface);

    void onDatabaseInteractorProcessFailure(String errorMessage);
}
