package com.instanect.aks_mvp.mvp.interactors.extractor;

import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseObjectInterface;
import com.instanect.aks_mvp.mvp.presenter.InteractorResponseInterface;

/**
 * Created by AKS on 10/9/2017.
 */

public interface ExtractorInteractorResponseInterface extends InteractorResponseInterface {

    void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface);
    <T> void onExtractorFailure(T t);
}
