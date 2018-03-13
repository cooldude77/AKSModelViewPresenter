package di;

import com.instanect.aks_mvp.mvp.view.factory.ViewFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 3/13/2018.
 */
@Module
public class AKSMVPModule {
    @Provides
    ViewFactory provideViewFactory() {
        return new ViewFactory();
    }

}
