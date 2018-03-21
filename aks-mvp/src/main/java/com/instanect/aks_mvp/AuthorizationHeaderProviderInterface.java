package com.instanect.aks_mvp;

import com.instanect.accountcommon.AuthorizationHeaderInterface;

/**
 * Created by AKS on 1/9/2018.
 */

public interface AuthorizationHeaderProviderInterface {
    AuthorizationHeaderInterface getAuthorizationHeaderWithToken();
}
