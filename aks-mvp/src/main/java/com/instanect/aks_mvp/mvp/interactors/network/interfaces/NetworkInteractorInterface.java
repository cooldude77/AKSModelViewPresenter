package com.instanect.aks_mvp.mvp.interactors.network.interfaces;


import com.instanect.accountcommon.account.authorization.AuthorizationHeaderInterface;
import com.instanect.networkcommon.NetworkInterface;
import com.instanect.networkcommon.NetworkResponseInterface;

import java.util.HashMap;

/**
 * Created by AKS on 10/6/2017.
 */

public interface NetworkInteractorInterface {

    NetworkInterface getNetworkInterface();

    NetworkInteractorResponseInterface getNetworkInteractorResponseInterface();

    void setNetworkInteractorResponseInterface(NetworkInteractorResponseInterface networkInteractorResponseInterface);

    void execute(AuthorizationHeaderInterface authorizationHeaderInterface,
                 String query,
                 HashMap<String, String> postOrPutBody);


    public void onError(String errorMessage, int errorCode);


    public void onInternetNotAvailable();


    public void onAdditionalUrlNotAvailable(String messageOnNotAvailable);


    public void onScenarioExecutionAbort();


    public <T> void onSuccess(NetworkResponseInterface<T> networkResponse);


}
