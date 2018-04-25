package com.instanect.aks_mvp.mvp.interactors.extractor.interfaces;

import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;

/**
 * Created by AKS on 10/9/2017.
 */

public interface ExtractorInteractorResponseInterface {

    void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface);
    <T> void onExtractorFailure(T t);
}
