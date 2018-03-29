package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountCreateResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountQueryResponseInterface;
import com.instanect.accountcommon.account.account.operations.interfaces.response.AccountUpdateResponseInterface;
import com.instanect.aks_mvp.LogTagGenerator;
import com.instanect.aks_mvp.mvp.interactors.account.interfaces.AccountInteractorInterface;
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


        if (cPresenterInterface == null)
            throw new IllegalArgumentException("Presenter class is null");

        PresenterInterface presenterInterface = cPresenterInterface
                .newInstance();

        setInteractors(presenterInterface);
        setPresenterAsResponseToInteractors(presenterInterface);
        return presenterInterface;
    }

    private void setPresenterAsResponseToInteractors(PresenterInterface presenterInterface) {

        if (accountInteractorInterface != null) {

            if (presenterInterface instanceof AccountCreateResponseInterface)
                accountInteractorInterface.setAccountCreateResponseInterface(
                        (AccountCreateResponseInterface) presenterInterface);

            if (presenterInterface instanceof AccountUpdateResponseInterface)
                accountInteractorInterface.setAccountUpdateResponseInterface(
                        (AccountUpdateResponseInterface) presenterInterface
                );

            if (presenterInterface instanceof AccountQueryResponseInterface)
                accountInteractorInterface.setAccountQueryResponseInterface(
                        (AccountQueryResponseInterface) presenterInterface
                );
        }
        if (databaseInteractorInterface != null)
            if (presenterInterface instanceof DatabaseInteractorResponseInterface)
                databaseInteractorInterface.setDatabaseInteractorResponseInterface(
                        (DatabaseInteractorResponseInterface) presenterInterface);


        if (extractorInteractorInterface != null)
            if (presenterInterface instanceof ExtractorInteractorResponseInterface)
                extractorInteractorInterface.setExtractorInteractorResponseInterface(
                        (ExtractorInteractorResponseInterface) presenterInterface);


        if (networkInteractorInterface != null)
            if (networkInteractorInterface instanceof NetworkInteractorResponseInterface)
                networkInteractorInterface.setNetworkInteractorResponseInterface(
                        (NetworkInteractorResponseInterface) presenterInterface);


        if (preferencesInteractorInterface != null) {
            if (preferencesInteractorInterface instanceof PreferencesInteractorResponseInterface)
                preferencesInteractorInterface.setPreferencesInteractorResponseInterface(
                        (PreferencesInteractorResponseInterface) presenterInterface);
        }

    }

    private void setInteractors(PresenterInterface presenterInterface) {

        if (accountInteractorInterface != null)
            presenterInterface.setAccountInteractorInterface(accountInteractorInterface);
        if (databaseInteractorInterface != null)
            presenterInterface.setDatabaseInteractorInterface(databaseInteractorInterface);
        if (extractorInteractorInterface != null)
            presenterInterface.setExtractorInteractorInterface(extractorInteractorInterface);
        if (networkInteractorInterface != null)
            presenterInterface.setNetworkInteractorInterface(networkInteractorInterface);
        if (preferencesInteractorInterface != null)
            presenterInterface.setPreferencesInteractorInterface(preferencesInteractorInterface);

    }
}