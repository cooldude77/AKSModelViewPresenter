package com.instanect.aksmodelviewpresenter.di;

import com.instanect.aksmodelviewpresenter.TestAKSMVPActivity;

import dagger.Component;

/**
 * Created by AKS on 3/28/2018.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(TestAKSMVPActivity testAKSMVPActivity);

}
