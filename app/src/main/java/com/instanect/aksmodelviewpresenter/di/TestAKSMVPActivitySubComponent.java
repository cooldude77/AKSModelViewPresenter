package com.instanect.aksmodelviewpresenter.di;

import com.instanect.aks_mvp.di.AKSMVPModule;
import com.instanect.aksmodelviewpresenter.TestAKSMVPActivity;

import dagger.Subcomponent;

@Subcomponent(modules = {AKSMVPModule.class})
public interface TestAKSMVPActivitySubComponent {

    void inject(TestAKSMVPActivity testAKSMVPActivity);

    @Subcomponent.Builder
    interface Builder {


        Builder aksMVPActivitySubComponent(AKSMVPModule aksmvpModule);


        TestAKSMVPActivitySubComponent build();


    }

}
