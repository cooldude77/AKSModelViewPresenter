package com.instanect.aks_mvp.mvp.view.helper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by AKS on 12/26/2017.
 */

public class AppViewHelper {

    private final Context context;
    private final View view;

    public AppViewHelper(Context context, View view) {
        this.context = context;
        this.view = view;
    }


    /**
     * Generic function to get form control values
     *
     * @param id id of the control
     * @return String
     */
    public String getStringFromEditText(int id) {

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


    public void hideProgressIndicator(int progressBarResId) {
        ProgressBar progressBar = view.findViewById(progressBarResId);
        if (progressBar != null)
            progressBar.setVisibility(View.GONE);

    }


    public void showProgressIndicator(int progressBarResId) {
        ProgressBar progressBar = view.findViewById(progressBarResId);
        if (progressBar != null)
            progressBar.setVisibility(View.VISIBLE);

    }


    public void hideKeyBoard() {
        // Check if no view has focus:
        View view = ((AppCompatActivity) context).getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }


    public void showKeyBoard() {
        // Check if no view has focus:
        View view = ((AppCompatActivity) context).getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                imm.showSoftInput(view, 0);
            }
        }
    }

    public Button findViewById(int resIdButton) {
        return view.findViewById(resIdButton);
    }

    public String getStringFromResource(int stringResId) {
        return context.getResources().getString(stringResId);
    }
}
