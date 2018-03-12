package com.instanect.aks_mvp.mvp.interactors.database.builder;

import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * DatabaseInteractorBuilder
 */

public class DatabaseInteractorBuilder {


    public DatabaseInteractorInterface getInstance(
            Class<? extends DatabaseInteractorInterface> classDatabaseInteractorInterface,
            DatabaseApiInterface databaseApiInterface)
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
