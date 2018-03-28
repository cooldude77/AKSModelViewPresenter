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

public class PresenterBuilder {

    private final String TAG = LogTagGenerator.getTag(PresenterBuilder.class);

    private AccountInteractorInterface accountInteractorInterface = null;
    private DatabaseInteractorInterface databaseInteractorInterface = null;
    private ExtractorInteractorInterface extractorInteractorInterface = null;
    private NetworkInteractorInterface networkInteractorInterface = null;
    private PreferencesInteractorInterface preferencesInteractorInterface = null;

    private Class<? extends PresenterInterface> cPresenterInterface;

    public PresenterBuilder setPresenterClass(Class<? extends PresenterInterface> cPresenterInterface) {

        this.cPresenterInterface = cPresenterInterface;
        return this;
    }

    public PresenterBuilder setAccountInteractorInterface(AccountInteractorInterface accountInteractorInterface) {
        this.accountInteractorInterface = accountInteractorInterface;
        return this;
    }

    public PresenterBuilder setDatabaseInteractorInterface(DatabaseInteractorInterface databaseInteractorInterface) {
        this.databaseInteractorInterface = databaseInteractorInterface;
        return this;
    }

    public PresenterBuilder setExtractorInteractorInterface(ExtractorInteractorInterface extractorInteractorInterface) {
        this.extractorInteractorInterface = extractorInteractorInterface;
        return this;
    }

    public PresenterBuilder setNetworkInteractorInterface(NetworkInteractorInterface networkInteractorInterface) {
        this.networkInteractorInterface = networkInteractorInterface;
        return this;
    }

    public PresenterBuilder setPreferencesInteractorInterface(PreferencesInteractorInterface preferencesInteractorInterface) {
        this.preferencesInteractorInterface = preferencesInteractorInterface;
        return this;
    }


    public PresenterInterface build() throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {


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
}