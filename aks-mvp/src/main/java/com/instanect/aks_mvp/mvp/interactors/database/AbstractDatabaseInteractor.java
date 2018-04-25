package com.instanect.aks_mvp.mvp.interactors.database;


import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseApiInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;

/**
 * Created by AKS on 10/7/2017.
 */

abstract public class AbstractDatabaseInteractor implements DatabaseInteractorInterface {
    private final DatabaseApiInterface databaseApiInterface;
    private DatabaseInteractorResponseInterface databaseInteractorResponseInterface;

    public AbstractDatabaseInteractor(DatabaseApiInterface databaseApiInterface) {
        this.databaseApiInterface = databaseApiInterface;
    }

    @Override
    public void setDatabaseInteractorResponseInterface(DatabaseInteractorResponseInterface databaseInteractorResponseInterface) {
        this.databaseInteractorResponseInterface = databaseInteractorResponseInterface;
    }

    @Override
    public DatabaseApiInterface getDatabaseApiInterface() {
        return databaseApiInterface;
    }

    @Override
    public DatabaseInteractorResponseInterface getDatabaseInteractorResponseInterface() {
        return databaseInteractorResponseInterface;
    }
}
