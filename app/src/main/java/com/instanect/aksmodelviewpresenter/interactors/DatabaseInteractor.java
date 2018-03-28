package com.instanect.aksmodelviewpresenter.interactors;

import com.instanect.aks_mvp.mvp.interactors.database.AbstractDatabaseInteractor;
import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseApiInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;

/**
 * Created by AKS on 3/28/2018.
 */

public class DatabaseInteractor extends AbstractDatabaseInteractor {
    public DatabaseInteractor(DatabaseApiInterface databaseApiInterface) {
        super(databaseApiInterface);
    }

    @Override
    public <T> void save(DatabaseObjectInterface databaseObjectInterface) {

    }
}
