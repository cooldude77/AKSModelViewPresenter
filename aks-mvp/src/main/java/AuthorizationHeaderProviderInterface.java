import com.instanect.aks_mvp.mvp.interactors.network.interfaces.AuthorizationHeaderInterface;

/**
 * Created by AKS on 1/9/2018.
 */

public interface AuthorizationHeaderProviderInterface {
    AuthorizationHeaderInterface getAuthorizationHeaderWithToken();
}
