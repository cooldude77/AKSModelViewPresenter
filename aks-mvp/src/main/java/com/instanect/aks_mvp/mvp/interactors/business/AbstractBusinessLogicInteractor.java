package com.instanect.aks_mvp.mvp.interactors.business;

import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorInterface;
import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInteractorResponseInterface;
import com.instanect.aks_mvp.mvp.interactors.business.interfaces.BusinessLogicInterface;

public abstract class AbstractBusinessLogicInteractor implements BusinessLogicInteractorInterface {

    private BusinessLogicInterface businessLogicInterface;
    private BusinessLogicInteractorResponseInterface businessLogicInteractorResponseInterface;

    public AbstractBusinessLogicInteractor(BusinessLogicInterface businessLogicInterface) {

        this.businessLogicInterface = businessLogicInterface;
    }

    public BusinessLogicInterface getBusinessLogicInterface() {
        return businessLogicInterface;
    }

    @Override
    public void setBusinessLogicInteractorResponseInterface(BusinessLogicInteractorResponseInterface businessLogicInteractorResponseInterface) {

        this.businessLogicInteractorResponseInterface = businessLogicInteractorResponseInterface;
    }
}
