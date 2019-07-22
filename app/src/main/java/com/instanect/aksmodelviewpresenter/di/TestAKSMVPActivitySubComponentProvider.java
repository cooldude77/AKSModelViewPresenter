package com.instanect.aksmodelviewpresenter.di;

import com.instanect.aks_mvp.di.AKSMVPModule;
import com.instanect.aksmodelviewpresenter.application.MainApplication;

public class TestAKSMVPActivitySubComponentProvider {


    public TestAKSMVPActivitySubComponent getSubComponent(MainApplication
                                                                  mainApplication) {

        return mainApplication.getAppComponent()
                .getTestAKSMVPActivitySubComponentBuilder()
                .aksMVPActivitySubComponent(
                        new AKSMVPModule(mainApplication.getApplicationContext())
                )
                .build();
    }
}
