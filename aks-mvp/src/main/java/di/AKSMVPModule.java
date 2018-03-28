package di;

import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.network.builder.NetworkInteractorBuilder;
import com.instanect.aks_mvp.mvp.interactors.preferences.builder.PreferenceInteractorBuilder;
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

    @Provides
    NetworkInteractorBuilder provideNetworkInteractorBuilder() {
        return new NetworkInteractorBuilder();
    }

    @Provides
    PreferenceInteractorBuilder providePreferenceInteractorBuilder(){
        return new PreferenceInteractorBuilder();
    }

    @Provides
    ExtractorInteractorBuilder provideExtractorInteractorBuilder(){
        return new ExtractorInteractorBuilder();
    }

    @Provides
    DatabaseInteractorBuilder provideDatabaseDatabaseInteractorBuilder(){
        return new DatabaseInteractorBuilder();
    }

}
