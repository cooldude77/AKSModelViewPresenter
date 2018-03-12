package com.instanect.aks_mvp.mvp.interactors.database.di;


import android.content.Context;


import com.instanect.aks_mvp.mvp.interactors.database.builder.DatabaseInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class DatabaseInteractorBuilderModule {


    @Provides
    public DatabaseInteractorBuilder provideDatabaseInteractorBuilder() {
        return new DatabaseInteractorBuilder();
    }


}
