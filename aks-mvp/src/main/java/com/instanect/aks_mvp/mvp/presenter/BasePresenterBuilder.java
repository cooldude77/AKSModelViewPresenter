package com.instanect.aks_mvp.mvp.presenter;

import android.util.Log;

import com.instanect.aks_mvp.LogTagGenerator;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;

import java.lang.reflect.InvocationTargetException;

public class BasePresenterBuilder {

    private final String TAG = LogTagGenerator.getTag(BasePresenterBuilder.class);

    private AccountInteractorInterface accountInteractorInterface = null;
    private DatabaseInteractorInterface databaseInteractorInterface = null;
    private ExtractorInteractorInterface extractorInteractorInterface = null;
    private NetworkInteractorInterface networkInteractorInterface = null;
    private PreferencesInteractorInterface preferencesInteractorInterface = null;

    private Class<? extends PresenterInterface> cPresenterInterface;

    private AccountInteractorResponseInterface accountInteractorResponseInterface;
    private DatabaseInteractorResponseInterface databaseInteractorResponseInterface;
    private ExtractorInteractorResponseInterface extractorInteractorResponseInterface;
    private NetworkInteractorResponseInterface networkInteractorResponseInterface;
    private PreferencesInteractorResponseInterface preferencesInteractorResponseInterface;

    public BasePresenterBuilder setPresenterClass(Class<? extends PresenterInterface> cPresenterInterface) {

        this.cPresenterInterface = cPresenterInterface;
        return this;
    }

    public BasePresenterBuilder setAccountInteractorInterface(AccountInteractorInterface accountInteractorInterface) {
        this.accountInteractorInterface = accountInteractorInterface;
        return this;
    }

    public BasePresenterBuilder setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface) {
        this.databaseInteractorInterface = databaseInteractorInterface;
        return this;
    }

    public BasePresenterBuilder setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface) {
        this.extractorInteractorInterface = extractorInteractorInterface;
        return this;
    }

    public BasePresenterBuilder setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface) {
        this.networkInteractorInterface = networkInteractorInterface;
        return this;
    }

    public BasePresenterBuilder setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface) {
        this.preferencesInteractorInterface = preferencesInteractorInterface;
        return this;
    }

    public void setAccountInteractorResponseInterface(
            AccountInteractorResponseInterface accountInteractorResponseInterface) {

        this.accountInteractorResponseInterface = accountInteractorResponseInterface;
    }

    public void setDatabaseInteractorResponseInterface(
            DatabaseInteractorResponseInterface databaseInteractorResponseInterface) {
        this.databaseInteractorResponseInterface = databaseInteractorResponseInterface;
    }

    public void setExtractorInteractorResponseInterface(
            ExtractorInteractorResponseInterface extractorInteractorResponseInterface) {

        this.extractorInteractorResponseInterface = extractorInteractorResponseInterface;
    }

    public void setNetworkInteractorResponseInterface(
            NetworkInteractorResponseInterface networkInteractorResponseInterface) {

        this.networkInteractorResponseInterface = networkInteractorResponseInterface;
    }

    public void setPreferencesInteractorResponseInterface(
            PreferencesInteractorResponseInterface preferencesInteractorResponseInterface) {

        this.preferencesInteractorResponseInterface = preferencesInteractorResponseInterface;
    }

    public PresenterInterface build() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        checkInteractorResponseSetButInteractorNotSet();

        logWarningWhenInteractorIsSetButResponseIsNotSet();

        setResponseToInteractors();


        Class[] arguments = new Class[5];

        arguments[0] = accountInteractorInterface.getClass();
        arguments[1] = databaseInteractorInterface.getClass();
        arguments[2] = extractorInteractorInterface.getClass();
        arguments[3] = networkInteractorInterface.getClass();
        arguments[4] = preferencesInteractorInterface.getClass();


        return cPresenterInterface
                .getDeclaredConstructor(arguments)
                .newInstance(
                        accountInteractorInterface,
                        databaseInteractorInterface,
                        extractorInteractorInterface,
                        networkInteractorInterface,
                        preferencesInteractorInterface);
    }

    private void logWarningWhenInteractorIsSetButResponseIsNotSet() {
        // Log warnings
        if (accountInteractorResponseInterface == null && accountInteractorInterface != null)
            logWarning("Account");

        if (databaseInteractorResponseInterface == null && databaseInteractorInterface != null)
            logWarning("Database");

        if (extractorInteractorResponseInterface == null && extractorInteractorInterface != null)
            logWarning("Extractor");

        if (networkInteractorResponseInterface == null && networkInteractorInterface != null)
            logWarning("Network");

        if (preferencesInteractorResponseInterface == null && preferencesInteractorInterface != null)
            logWarning("Preferences");

    }

    private void setResponseToInteractors() {

        if (accountInteractorInterface != null)
            accountInteractorInterface
                    .setAccountInteractorResponseInterface(accountInteractorResponseInterface);
        if (databaseInteractorInterface != null)
            databaseInteractorInterface
                    .setDatabaseInteractorResponseInterface(databaseInteractorResponseInterface);
        if (extractorInteractorInterface != null)
            extractorInteractorInterface
                    .setExtractorInteractorResponseInterface(extractorInteractorResponseInterface);
        if (networkInteractorInterface != null)
            networkInteractorInterface
                    .setNetworkInteractorResponseInterface(networkInteractorResponseInterface);
        if (preferencesInteractorInterface != null)
            preferencesInteractorInterface
                    .setPreferencesInteractorResponseInterface(preferencesInteractorResponseInterface);


    }

    private void checkInteractorResponseSetButInteractorNotSet() {

        if (accountInteractorResponseInterface != null && accountInteractorInterface == null)
            throwInternactorNullButResponseSetException("Account");
        if (databaseInteractorResponseInterface != null && databaseInteractorInterface == null)
            throwInternactorNullButResponseSetException("Database");
        if (extractorInteractorResponseInterface != null && extractorInteractorInterface == null)
            throwInternactorNullButResponseSetException("Extractor");
        if (networkInteractorResponseInterface != null && networkInteractorInterface == null)
            throwInternactorNullButResponseSetException("Network");
        if (preferencesInteractorResponseInterface != null && preferencesInteractorInterface == null)
            throwInternactorNullButResponseSetException("Preferences");

    }

    private void logWarning(String nameOfInteractor) {

        Log.d(TAG, nameOfInteractor + " is set but response interface is not set");

    }

    private void throwInternactorNullButResponseSetException(String nameOfInteractor) {

        throw new IllegalArgumentException(nameOfInteractor + " interactor is not set " +
                "but response interface is set ");
    }
}