package com.instanect.aks_mvp.mvp.interactors.database.builder;

import com.instanect.mainapp.layers.business.mvp.interactors.database.interfaces.DatabaseInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * DatabaseInteractorBuilder
 */

public class DatabaseInteractorBuilder {

    private DatabaseApiInterface databaseApiInterface;

    public DatabaseInteractorBuilder(DatabaseApiInterface databaseApiInterface) {

        this.databaseApiInterface = databaseApiInterface;
    }

    public DatabaseInteractorInterface getInstance(
            Class<? extends DatabaseInteractorInterface> classDatabaseInteractorInterface)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class[] arguments = new Class[1];
        arguments[0] = DatabaseApiInterface.class;


        return classDatabaseInteractorInterface
                .getDeclaredConstructor(arguments)
                .newInstance(databaseApiInterface);

    }
}
