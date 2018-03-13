package com.instanect.aks_mvp.mvp.view.helper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.instanect.aks_mvp.mvp.view.AppViewHelperInterface;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by AKS on 12/26/2017.
 */

public class AppViewHelper implements AppViewHelperInterface{

    private final Context context;
    private View view;

    public AppViewHelper(Context context) {
        this.context = context;
    }

    public void setView(View view) {
        this.view = view;
    }

    /**
     * Generic function to get form control values
     *
     * @param id id of the control
     * @return String
     */
    public String getStringFromEditText(int id) {
        assertNotNull(view);
        EditText editText = view.findViewById(id);
        return editText != null ? editText.getText().toString() : null;
    }


    public void toastLong(String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }


    public void toastShort(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }


    public void toastLong(int resId) {
        toastLong(context.getResources().getString(resId));
    }


    public void toastShort(int resId) {
        toastShort(context.getResources().getString(resId));
    }

    @Override
    public Button findButton(int resIdButton) {
        return null;
    }


    public void hideProgressIndicator(int progressBarResId) {
        assertNotNull(view);
        ProgressBar progressBar = view.findViewById(progressBarResId);
        if (progressBar != null)
            progressBar.setVisibility(View.GONE);

    }


    public void showProgressIndicator(int progressBarResId) {
        assertNotNull(view);
        ProgressBar progressBar = view.findViewById(progressBarResId);
        if (progressBar != null)
            progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgressIndicator() {

    }

    @Override
    public void showProgressIndicator() {

    }


    public void hideKeyBoard() {
        assertNotNull(view);
        // Check if no currentFocus has focus:
        View currentFocus = ((AppCompatActivity) context).getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }


    public void showKeyBoard() {
        assertNotNull(view);
        // Check if no currentFocus has focus:
        View currentFocus = ((AppCompatActivity) context).getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.showSoftInput(currentFocus, 0);
            }
        }
    }

    public Button findViewById(int resIdButton) {
        assertNotNull(view);
        return view.findViewById(resIdButton);
    }

    public String getStringFromResource(int stringResId) {
        assertNotNull(view);
        return context.getResources().getString(stringResId);
    }
}
