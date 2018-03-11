package com.instanect.aks_mvp.mvp.interactors.extractor;

import com.instanect.mainapp.layers.business.database.DatabaseObjectInterface;

/**
 * Created by AKS on 10/9/2017.
 */

public interface ExtractorInteractorResponseInterface {

    void onExtractorSuccess(DatabaseObjectInterface databaseObjectInterface);
}
