package com.instanect.aks_mvp.mvp.view;

import android.widget.Button;

import com.instanect.mainapp.layers.business.mvp.view.helper.AppViewHelper;
import com.instanect.mainapp.layers.business.mvp.view.interfaces.ViewInterface;


/**
 * ViewInterface
 */

public class AbstractView implements ViewInterface {

    private AppViewHelper appViewHelper;
    private int progressBarId;

    public AbstractView(AppViewHelper appViewHelper) {

        this.appViewHelper = appViewHelper;
    }

    public void setProgressBarId(int progressBarId) {

        this.progressBarId = progressBarId;
    }

    @Override
    public Button findButton(int resIdButton) {

        return appViewHelper.findViewById(resIdButton);
    }

    /**
     * Generic function to get form control values
     *
     * @param id id of the control
     * @return String
     */
    protected String getStringFromEditText(int id) {

        return appViewHelper.getStringFromEditText(id);
    }

    public String getStringFromResource(int stringResId) {
        return appViewHelper.getStringFromResource(stringResId);
    }

    @Override
    public void toastLong(String message) {
        appViewHelper.toastLong(message);
    }

    @Override
    public void toastShort(String message) {
        appViewHelper.toastShort(message);
    }

    @Override
    public void toastLong(int resId) {
        appViewHelper.toastLong(resId);
    }

    @Override
    public void toastShort(int resId) {
        appViewHelper.toastShort(resId);
    }

    @Override
    public void hideProgressIndicator(int resIdProgressBar) {
        appViewHelper.hideProgressIndicator(resIdProgressBar);
    }

    @Override
    public void showProgressIndicator(int resIdProgressBar) {
        appViewHelper.showProgressIndicator(resIdProgressBar);
    }

    @Override
    public void hideProgressIndicator() {
        appViewHelper.hideProgressIndicator(progressBarId);
    }

    @Override
    public void showProgressIndicator() {
        appViewHelper.showProgressIndicator(progressBarId);
    }

    @Override
    public void hideKeyBoard() {
        appViewHelper.hideKeyBoard();
    }

    @Override
    public void showKeyBoard() {
        appViewHelper.hideKeyBoard();
    }
}
