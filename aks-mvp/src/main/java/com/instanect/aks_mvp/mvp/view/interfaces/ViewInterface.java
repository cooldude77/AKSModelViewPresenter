package com.instanect.aks_mvp.mvp.view.interfaces;

import android.widget.Button;

/**
 * ViewInterface
 */

public interface ViewInterface {


    void hideProgressIndicator(int resIdProgressBar);

    void showProgressIndicator(int resIdProgressBar);

    void hideProgressIndicator();

    void showProgressIndicator();


    void toastLong(int resId);

    void toastShort(int resId);

    Button findButton(int resIdButton);

    void toastLong(String string);

    void toastShort(String string);


    void hideKeyBoard();

    void showKeyBoard();
}
