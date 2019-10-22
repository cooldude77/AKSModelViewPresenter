package com.instanect.aks_mvp.mvp.view;

import android.view.View;
import android.widget.Button;

/**
 * Created by AKS on 3/12/2018.
 */

public interface AppViewHelperInterface {
    View findViewById(int resIdButton);

    void setView(View view);

    String getStringFromEditText(int id);


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

    String getStringFromResource(int stringResId);
}
