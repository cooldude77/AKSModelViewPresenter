package com.instanect.aks_mvp.mvp.interactors.database.di;


import android.content.Context;

import com.instanect.mainapp.layers.business.database.api.DatabaseApi;
import com.instanect.mainapp.layers.business.database.api.di.DaggerDatabaseApiComponent;
import com.instanect.mainapp.layers.business.database.api.di.DatabaseApiModule;
import com.instanect.mainapp.layers.business.mvp.interactors.database.builder.DatabaseInteractorBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * Created by AKS on 10/6/2017.
 */

@Module
public class DatabaseInteractorBuilderModule {

    //   DatabaseApi databaseApiInterface;
    private Context context;

    public DatabaseInteractorBuilderModule(Context context) {
        this.context = context;
    }

    @Provides
    public DatabaseInteractorBuilder provideDatabaseInteractorBuilder() {
        DatabaseApi databaseApi = DaggerDatabaseApiComponent.builder()
                .databaseApiModule(new DatabaseApiModule(context))
                .build()
                .getDatabaseApi();
        return new DatabaseInteractorBuilder(databaseApi);
    }


}
