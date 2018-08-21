package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.LogTagGenerator;
import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.database.interfaces.DatabaseInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.extractor.interfaces.ExtractorInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.network.interfaces.NetworkInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.presenter.interfaces.PresenterInterface;

public class PresenterBuilder {

    private final String TAG = LogTagGenerator.getTag(PresenterBuilder.class);

    private DatabaseInteractorInterface databaseInteractorInterface = null;
    private ExtractorInteractorInterface extractorInteractorInterface = null;
    private NetworkInteractorInterface networkInteractorInterface = null;
    private PreferencesInteractorInterface preferencesInteractorInterface = null;
    private BusinessLogicInteractorInterface businessLogicInteractorInterface = null;

    private Class<? extends PresenterInterface> cPresenterInterface;

    public PresenterBuilder setPresenterClass(Class<? extends PresenterInterface> cPresenterInterface) {

        this.cPresenterInterface = cPresenterInterface;
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

    public PresenterBuilder setBusinessLogicInteractorInterface(BusinessLogicInteractorInterface businessLogicInteractorInterface) {
        this.businessLogicInteractorInterface = businessLogicInteractorInterface;
        return this;
    }

    public PresenterInterface build() throws
            IllegalAccessException,
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

        if (databaseInteractorInterface != null)
            if (presenterInterface instanceof DatabaseInteractorResponseInterface)
                databaseInteractorInterface.setDatabaseInteractorResponseInterface(
                        (DatabaseInteractorResponseInterface) presenterInterface);


        if (extractorInteractorInterface != null)
            if (presenterInterface instanceof ExtractorInteractorResponseInterface)
                extractorInteractorInterface.setExtractorInteractorResponseInterface(
                        (ExtractorInteractorResponseInterface) presenterInterface);


        if (networkInteractorInterface != null)
            if (presenterInterface instanceof NetworkInteractorResponseInterface)
                networkInteractorInterface.setNetworkInteractorResponseInterface(
                        (NetworkInteractorResponseInterface) presenterInterface);


        if (preferencesInteractorInterface != null) {
            if (presenterInterface instanceof PreferencesInteractorResponseInterface)
                preferencesInteractorInterface.setPreferencesInteractorResponseInterface(
                        (PreferencesInteractorResponseInterface) presenterInterface);
        }

        if (businessLogicInteractorInterface != null)
            if (presenterInterface instanceof BusinessLogicInteractorInterface)
                businessLogicInteractorInterface.setBusinessLogicInteractorResponseInterface(
                        (BusinessLogicInteractorResponseInterface) presenterInterface
                );
    }

    private void setInteractors(PresenterInterface presenterInterface) {

        if (databaseInteractorInterface != null)
            presenterInterface.setDatabaseInteractorInterface(databaseInteractorInterface);
        if (extractorInteractorInterface != null)
            presenterInterface.setExtractorInteractorInterface(extractorInteractorInterface);
        if (networkInteractorInterface != null)
            presenterInterface.setNetworkInteractorInterface(networkInteractorInterface);
        if (preferencesInteractorInterface != null)
            presenterInterface.setPreferencesInteractorInterface(preferencesInteractorInterface);
        if (businessLogicInteractorInterface != null)
            presenterInterface.setBusinessLogicInteractorInterface(businessLogicInteractorInterface);
    }
}