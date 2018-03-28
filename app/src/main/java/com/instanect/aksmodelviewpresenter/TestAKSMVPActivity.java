package com.instanect.aksmodelviewpresenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.instanect.aksmodelviewpresenter.presenter.MVPPresenter;

import javax.inject.Inject;

/**
 * Created by AKS on 3/14/2018.
 */

public class TestAKSMVPActivity extends AppCompatActivity {
    @Inject
    MVPPresenter mvpPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
