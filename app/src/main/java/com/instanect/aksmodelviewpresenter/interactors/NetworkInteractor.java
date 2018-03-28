package com.instanect.aksmodelviewpresenter.interactors;

import com.instanect.accountcommon.account.authorization.AuthorizationHeaderInterface;
import com.instanect.aks_mvp.mvp.interactors.network.AbstractNetworkInteractor;
import com.instanect.networkcommon.NetworkInterface;

import java.util.HashMap;

/**
 * Created by AKS on 3/28/2018.
 */

public class NetworkInteractor extends AbstractNetworkInteractor {
    public NetworkInteractor(NetworkInterface networkInterface) {
        super(networkInterface);
    }

    @Override
    public void execute(
            AuthorizationHeaderInterface authorizationHeaderInterface,
            String query, HashMap<String, String> postOrPutBody) {

    }
}
