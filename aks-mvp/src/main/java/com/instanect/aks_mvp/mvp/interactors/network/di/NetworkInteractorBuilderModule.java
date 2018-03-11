package com.instanect.aks_mvp.mvp.interactors.network.di;


import android.content.Context;


import com.instanect.aks_mvp.mvp.interactors.network.builder.NetworkInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class NetworkInteractorBuilderModule {

    private Context context;

    public NetworkInteractorBuilderModule(Context context) {

        this.context = context;
    }

    @Provides
    public NetworkInteractorBuilder provideNetworkInteractorBuilder() {


        return null;
    }


}
