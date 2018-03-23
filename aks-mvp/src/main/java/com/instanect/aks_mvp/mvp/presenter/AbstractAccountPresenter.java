package com.instanect.aks_mvp.mvp.presenter;

import com.instanect.aks_mvp.mvp.interactors.account.AbstractAccountInteractor;
import com.instanect.aks_mvp.mvp.interactors.database.AbstractDatabaseInteractor;
import com.instanect.aks_mvp.mvp.interactors.extractor.AbstractExtractorInteractor;
import com.instanect.aks_mvp.mvp.interactors.network.AbstractNetworkInteractor;
import com.instanect.aks_mvp.mvp.interactors.preferences.AbstractPreferencesInteractor;
import com.instanect.aks_mvp.mvp.view.interfaces.ViewInterface;

/**
 * Created by AKS on 3/20/2018.
 */

public class AbstractAccountPresenter extends AbstractPresenter {
    protected final AbstractAccountInteractor accountInteractor;

    public AbstractAccountPresenter(
            AbstractAccountInteractor accountInteractor,
            AbstractDatabaseInteractor databaseInteractor,
            AbstractExtractorInteractor extractorInteractor,
            AbstractNetworkInteractor networkInteractor,
            AbstractPreferencesInteractor preferencesInteractor) {
        super(databaseInteractor, extractorInteractor, networkInteractor, preferencesInteractor);
        this.accountInteractor = accountInteractor;
    }

    @Override
    public void attachView(ViewInterface viewInterface) {

    }
}
