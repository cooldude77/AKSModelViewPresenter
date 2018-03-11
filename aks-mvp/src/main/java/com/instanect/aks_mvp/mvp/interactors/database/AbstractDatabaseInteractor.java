package com.instanect.aks_mvp.mvp.interactors.database;


import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseApiInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;

/**
 * Created by AKS on 10/7/2017.
 */

abstract public class AbstractDatabaseInteractor implements DatabaseInteractorInterface {
    protected final DatabaseApiInterface databaseApiInterface;
    protected DatabaseInteractorResponseInterface databaseInteractorResponseInterface;

    public AbstractDatabaseInteractor(DatabaseApiInterface databaseApiInterface) {
        this.databaseApiInterface = databaseApiInterface;
    }

    @Override
    public void setDatabaseInteractorResponseInterface(DatabaseInteractorResponseInterface databaseInteractorResponseInterface) {
        this.databaseInteractorResponseInterface = databaseInteractorResponseInterface;
    }

}
