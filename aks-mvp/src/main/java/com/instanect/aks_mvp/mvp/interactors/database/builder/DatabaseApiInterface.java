package com.instanect.aks_mvp.mvp.interactors.database.builder;

import com.instanect.mainapp.layers.business.api.objects.UserObject;
import com.instanect.mainapp.layers.business.dataObjects.user.UserData;

/**
 * Created by AKS on 10/26/2017.
 */

public interface DatabaseApiInterface {
    void saveUser(UserObject userObject);

    void wipe();

    UserData getUserDataByInstanectCode(String instanectCode);
}
