package com.instanect.aksmodelviewpresenter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.instanect.aks_mvp.mvp.alert.GenericAlertDialogBuilder;
import com.instanect.aksmodelviewpresenter.application.MainApplication;
import com.instanect.aksmodelviewpresenter.presenter.MVPPresenter;

import javax.inject.Inject;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by AKS on 3/14/2018.
 */

public class TestAKSMVPActivity extends AppCompatActivity {
    @Inject
    MVPPresenter mvpPresenter;
    @Inject
    GenericAlertDialogBuilder genericAlertDialogBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MainApplication) getApplication())
                .getTestAKSMVPActivitySubComponent()
                .inject(this);

        assertNotNull(mvpPresenter);

    }
}
