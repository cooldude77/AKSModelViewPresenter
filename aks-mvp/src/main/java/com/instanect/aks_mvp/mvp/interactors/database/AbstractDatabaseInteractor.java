package com.instanect.aks_mvp.mvp.interactors.database;

import com.instanect.mainapp.layers.business.dataObjects.user.UserData;
import com.instanect.mainapp.layers.business.mvp.interactors.database.builder.DatabaseApiInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.mainapp.layers.business.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;

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


    @Override
    public UserData getUserDataByInstanectCode(String instanectCode) {
        return databaseApiInterface.getUserDataByInstanectCode(instanectCode);
    }
}
