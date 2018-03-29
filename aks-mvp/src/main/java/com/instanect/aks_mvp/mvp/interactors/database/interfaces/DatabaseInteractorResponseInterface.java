package com.instanect.aks_mvp.mvp.interactors.database.interfaces;

/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorResponseInterface {
    void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface);

    void onDatabaseInteractorProcessFailure(String errorMessage);
}
