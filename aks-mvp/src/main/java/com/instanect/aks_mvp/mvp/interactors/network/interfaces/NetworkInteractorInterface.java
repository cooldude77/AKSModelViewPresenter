package com.instanect.aks_mvp.mvp.interactors.network.interfaces;

import com.instanect.restvolley.newNetwork.common.authorization.AuthorizationHeaderInterface;

import java.util.HashMap;

/**
 * Created by AKS on 10/6/2017.
 */

public interface NetworkInteractorInterface {

    void setNetworkInteractorResponseInterface(NetworkInteractorResponseInterface networkInteractorResponseInterface);

    void execute(AuthorizationHeaderInterface authorizationHeaderInterface,
                 String query,
                 HashMap<String, String> postOrPutBody);
}
