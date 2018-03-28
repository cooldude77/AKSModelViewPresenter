package com.instanect.aksmodelviewpresenter.application;

import android.app.Application;

import com.instanect.aksmodelviewpresenter.di.AppComponent;
import com.instanect.aksmodelviewpresenter.di.DaggerAppComponent;

/**
 * Created by AKS on 3/28/2018.
 */

public class MainApplication extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
