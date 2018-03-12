package com.instanect.aks_mvp.mvp.view;

import android.widget.Button;

import com.instanect.aks_mvp.mvp.view.interfaces.ViewInterface;


/**
 * ViewInterface
 */

public class AbstractView implements ViewInterface {

    private AppViewHelperInterface appViewHelperInterface;
    private int progressBarId;

    public AbstractView(AppViewHelperInterface appViewHelperInterface) {

        this.appViewHelperInterface = appViewHelperInterface;
    }


    public void setProgressBarId(int progressBarId) {

        this.progressBarId = progressBarId;
    }

    @Override
    public Button findButton(int resIdButton) {

        return appViewHelperInterface.findViewById(resIdButton);
    }

    /**
     * Generic function to get form control values
     *
     * @param id id of the control
     * @return String
     */
    protected String getStringFromEditText(int id) {

        return appViewHelperInterface.getStringFromEditText(id);
    }

    public String getStringFromResource(int stringResId) {
        return appViewHelperInterface.getStringFromResource(stringResId);
    }

    @Override
    public void toastLong(String message) {
        appViewHelperInterface.toastLong(message);
    }

    @Override
    public void toastShort(String message) {
        appViewHelperInterface.toastShort(message);
    }

    @Override
    public void toastLong(int resId) {
        appViewHelperInterface.toastLong(resId);
    }

    @Override
    public void toastShort(int resId) {
        appViewHelperInterface.toastShort(resId);
    }

    @Override
    public void hideProgressIndicator(int resIdProgressBar) {
        appViewHelperInterface.hideProgressIndicator(resIdProgressBar);
    }

    @Override
    public void showProgressIndicator(int resIdProgressBar) {
        appViewHelperInterface.showProgressIndicator(resIdProgressBar);
    }

    @Override
    public void hideProgressIndicator() {
        appViewHelperInterface.hideProgressIndicator(progressBarId);
    }

    @Override
    public void showProgressIndicator() {
        appViewHelperInterface.showProgressIndicator(progressBarId);
    }

    @Override
    public void hideKeyBoard() {
        appViewHelperInterface.hideKeyBoard();
    }

    @Override
    public void showKeyBoard() {
        appViewHelperInterface.hideKeyBoard();
    }
}
