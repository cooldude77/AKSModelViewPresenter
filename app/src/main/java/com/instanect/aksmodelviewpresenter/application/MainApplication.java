package com.instanect.aksmodelviewpresenter.application;

import android.app.Application;

import com.instanect.aksmodelviewpresenter.di.AppComponent;
import com.instanect.aksmodelviewpresenter.di.AppModule;
import com.instanect.aksmodelviewpresenter.di.DaggerAppComponent;
import com.instanect.aksmodelviewpresenter.di.TestAKSMVPActivitySubComponent;
import com.instanect.aksmodelviewpresenter.di.TestAKSMVPActivitySubComponentProvider;

/**
 * Created by AKS on 3/28/2018.
 */

public class MainApplication extends Application {
    AppComponent appComponent;
    private TestAKSMVPActivitySubComponent testAKSMVPActivitySubComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = createAppComponent();

    }

    private AppComponent createAppComponent() {
        return DaggerAppComponent.builder().appModule(new AppModule()).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public TestAKSMVPActivitySubComponent getTestAKSMVPActivitySubComponent() {
        if (testAKSMVPActivitySubComponent == null)
            testAKSMVPActivitySubComponent =
                    new TestAKSMVPActivitySubComponentProvider()
                            .getSubComponent(this);

        return testAKSMVPActivitySubComponent;
    }
}
