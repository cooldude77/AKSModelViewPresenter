package com.instanect.aks_mvp.mvp.alert;

import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;

import com.instanect.aks_mvp.LogTagGenerator;
import com.instanect.aks_mvp.mvp.alert.interfaces.GenericAlertDialogResponseInterface;
import com.instanect.aks_mvp.mvp.alert.interfaces.GenericAlertDialogViewResponseInterface;
import com.instanect.aks_mvp.mvp.alert.interfaces.base.GenericAlertDialogBaseResponseInterface;
import com.instanect.aks_mvp.mvp.alert.interfaces.neutral.GenericAlertDialogViewWithNeutralResponseInterface;
import com.instanect.aks_mvp.mvp.alert.interfaces.neutral.GenericAlertDialogWithNeutralResponseInterface;
import com.instanect.aks_mvp.mvp.exception.GenericAlertDialogBuilderException;

import static org.junit.Assert.assertNotNull;


/**
 * GenericAlertDialogBuilder
 */

public class GenericAlertDialogBuilder {
    private final String TAG = LogTagGenerator.getTag(GenericAlertDialogBuilder.class);
    private LayoutInflater inflater;
    private String title;
    private String message;
    private String positiveButtonText;
    private String negativeButtonText;
    private GenericAlertDialogBaseResponseInterface onResponse;
    private int alertCode;
    private View view;
    private String neutralButtonText;
    private AlertDialogBuilderProvider alertDialogBuilderProvider;
    private AlertDialog.Builder builder;
    private Object objectToBePassedToCaller;
    private Context context;
    private int style;

    public GenericAlertDialogBuilder(AlertDialogBuilderProvider alertDialogBuilderProvider) {

        this.alertDialogBuilderProvider = alertDialogBuilderProvider;
    }

    // Context should always be activity context
    public GenericAlertDialogBuilder builder(Context context) throws GenericAlertDialogBuilderException {

        if (context == null)
            throw new GenericAlertDialogBuilderException("Context is null");

        this.inflater = (LayoutInflater) context
                .getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        this.context = context;

        title = null;
        message = null;
        positiveButtonText = null;
        negativeButtonText = null;
        neutralButtonText = null;
        alertCode = -1;
        style = -1;
        view = null;
        onResponse = null;
        objectToBePassedToCaller = null;

        return this;
    }

    public GenericAlertDialogBuilder setStyle(int style) {

        this.style = style;
        return this;
    }

    public GenericAlertDialogBuilder setTitle(String title) {

        this.title = title;
        return this;
    }

    public GenericAlertDialogBuilder setTitle(int resId) {

        assertNotNull(context);
        return setTitle(context.getString(resId));

    }

    public GenericAlertDialogBuilder setMessage(String message) {

        this.message = message;
        return this;
    }

    public GenericAlertDialogBuilder setMessage(int resId) {

        assertNotNull(context);
        return setMessage(context.getString(resId));

    }

    public GenericAlertDialogBuilder setView(View view) {
        this.view = view;

        return this;
    }

    public GenericAlertDialogBuilder setView(int resViewId) {
        this.view = inflater.inflate(resViewId, null);

        return this;
    }

    public GenericAlertDialogBuilder setPositiveButtonText(String positiveButtonText) {

        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public GenericAlertDialogBuilder setPositiveButtonText(int resId) {
        assertNotNull(context);
        return setPositiveButtonText(context.getString(resId));
    }

    public GenericAlertDialogBuilder setNegativeButtonText(String negativeButtonText) {

        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public GenericAlertDialogBuilder setNegativeButtonText(int resId) {
        assertNotNull(context);
        return setNegativeButtonText(context.getString(resId));

    }

    public GenericAlertDialogBuilder setResponse(
            GenericAlertDialogBaseResponseInterface response, int alertCode) {
        onResponse = response;
        this.alertCode = alertCode;
        return this;
    }

    public <T> GenericAlertDialogBuilder setParameter(T t) {

        this.objectToBePassedToCaller = t;
        return this;
    }

    public Dialog build() throws GenericAlertDialogBuilderException {

        // should be true for view/non view
        if (builder == null || context == null || inflater == null)
            throw new GenericAlertDialogBuilderException("Builder/context/inflater is null");
        if (title == null)
            throw new GenericAlertDialogBuilderException("Title is null");
        if (onResponse == null)
            throw new GenericAlertDialogBuilderException("On Response is null");
        if (positiveButtonText == null)
            throw new GenericAlertDialogBuilderException("Positive Text not provided");

        if (neutralButtonText != null)
            if (!(
                    onResponse instanceof GenericAlertDialogWithNeutralResponseInterface
                            || onResponse instanceof GenericAlertDialogViewWithNeutralResponseInterface)
            )
                throw new GenericAlertDialogBuilderException("Neutral Button Text Exists. " +
                        "The response interface should be of type \"GenericAlertDialogWithNeutralResponseInterface\" or " +
                        "\"GenericAlertDialogViewWithNeutralResponseInterface\"");

        // for view
        if (view != null) {

            if (!(onResponse instanceof GenericAlertDialogViewResponseInterface))
                throw new GenericAlertDialogBuilderException("On Response is either null " +
                        "or it is not an instance of \"GenericAlertDialogViewResponseInterface\" ");
        } else {
            // for non view

            if (message == null) // If view is not null , there
                // is no need of message
                throw new GenericAlertDialogBuilderException("Message is empty");


        }

        if (style != -1)
            builder = alertDialogBuilderProvider.getBuilder(context, style);
        else
            builder = alertDialogBuilderProvider.getBuilder(context);


        final AlertDialog alertDialog = builder.create();
        alertDialog.setTitle(title);

        if (view != null) {
            alertDialog.setView(view);
        } else {
            alertDialog.setMessage(message);
        }


        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,
                positiveButtonText,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (view != null)
                            ((GenericAlertDialogViewResponseInterface) onResponse)
                                    .onPositiveButtonClicked(alertCode, view, objectToBePassedToCaller);
                        else {
                            ((GenericAlertDialogResponseInterface) onResponse)
                                    .onPositiveButtonClicked(alertCode, objectToBePassedToCaller);
                        }
                        // Need to dismiss this manually as the view stays even
                        // after the dialog is closed
                        if (alertDialog.isShowing()) {
                            alertDialog.dismiss();
                            if (view != null)
                                ((ViewGroup) view.getParent()).removeView(view);
                        }

                    }
                });

        if (negativeButtonText != null)
            alertDialog.setButton(
                    DialogInterface.BUTTON_NEGATIVE,
                    negativeButtonText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (view != null)
                                ((GenericAlertDialogViewResponseInterface) onResponse)
                                        .onNegativeButtonClicked(alertCode, view, objectToBePassedToCaller);
                            else
                                ((GenericAlertDialogResponseInterface) onResponse).onNegativeButtonClicked(alertCode, objectToBePassedToCaller);
                        }
                    });

        if (neutralButtonText != null)
            builder.setNeutralButton(neutralButtonText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            if (view != null)
                                ((GenericAlertDialogViewWithNeutralResponseInterface) onResponse)
                                        .onNeutralButtonPressed(alertCode, view, objectToBePassedToCaller);
                            else
                                ((GenericAlertDialogWithNeutralResponseInterface) onResponse)
                                        .onNeutralButtonPressed(alertCode, objectToBePassedToCaller);
                        }
                    });

        // Need to dismiss this manually as the view stays even
        // after the dialog is closed
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
            if (view != null)
                ((ViewGroup) view.getParent()).removeView(view);
        }


        return alertDialog;
    }


    public GenericAlertDialogBuilder setNeutralResponse(String neutralButtonText) {
        this.neutralButtonText = neutralButtonText;
        return this;
    }

}
