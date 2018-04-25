package com.instanect.aks_mvp.mvp.interactors.database.interfaces;


import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseApiInterface;

/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorInterface {

    <T> void save(DatabaseObjectInterface databaseObjectInterface);

    void setDatabaseInteractorResponseInterface(DatabaseInteractorResponseInterface databaseInteractorResponseInterface);


    public DatabaseApiInterface getDatabaseApiInterface();

    public DatabaseInteractorResponseInterface getDatabaseInteractorResponseInterface();
}
