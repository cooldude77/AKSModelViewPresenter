package com.instanect.aks_mvp.mvp.interactors.database.interfaces;

import com.instanect.mainapp.layers.business.database.DatabaseObjectInterface;

/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorResponseInterface {
    void onDatabaseInteractorProcessSuccess(DatabaseObjectInterface databaseObjectInterface);

    void onDatabaseInteractorProcessFailure(String errorMessage);
}
