package com.instanect.aks_mvp.mvp.interactors.database.interfaces;

import com.instanect.mainapp.layers.business.dataObjects.user.UserData;
import com.instanect.mainapp.layers.business.database.DatabaseObjectInterface;

/**
 * Created by AKS on 10/6/2017.
 */

public interface DatabaseInteractorInterface {

    <T> void save(DatabaseObjectInterface databaseObjectInterface);

    void setDatabaseInteractorResponseInterface(DatabaseInteractorResponseInterface databaseInteractorResponseInterface);

    UserData getUserDataByInstanectCode(String instanectCode);
}
