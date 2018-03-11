package com.instanect.aks_mvp.mvp.interactors.database.interfaces;


/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorInterface {

    <T> void save(DatabaseObjectInterface databaseObjectInterface);

    void setDatabaseInteractorResponseInterface(DatabaseInteractorResponseInterface databaseInteractorResponseInterface);

}
