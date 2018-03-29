package com.instanect.aks_mvp.mvp.interactors.database.interfaces;

import com.instanect.aks_mvp.mvp.presenter.InteractorResponseInterface;

/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorResponseInterface extends InteractorResponseInterface {
    void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface);

    void onDatabaseInteractorProcessFailure(String errorMessage);
}
