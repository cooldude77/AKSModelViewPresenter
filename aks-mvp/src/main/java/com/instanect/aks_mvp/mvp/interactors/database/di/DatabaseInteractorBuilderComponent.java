package com.instanect.aks_mvp.mvp.interactors.database.di;

import com.instanect.mainapp.layers.business.database.api.di.DatabaseApiComponent;
import com.instanect.mainapp.layers.business.mvp.interactors.database.builder.DatabaseInteractorBuilder;

import dagger.Component;

/**
 * Created by AKS on 10/6/2017.
 */

@Component(modules = DatabaseInteractorBuilderModule.class,
        dependencies = {DatabaseApiComponent.class})
public interface DatabaseInteractorBuilderComponent {
    DatabaseInteractorBuilder provideDatabaseInteractorBuilder();
}
