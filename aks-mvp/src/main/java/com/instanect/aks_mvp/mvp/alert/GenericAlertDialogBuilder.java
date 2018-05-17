package com.instanect.aks_mvp.mvp.alert;

import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.instanect.aks_mvp.LogTagGenerator;

import static junit.framework.Assert.assertNotNull;

/**
 * GenericAlertDialogBuilder
 */

public class GenericAlertDialogBuilder {
    private final String TAG = LogTagGenerator.getTag(GenericAlertDialogBuilder.class);
    private LayoutInflater inflater;
    private AlertDialog.Builder builderV7;
    private String title;
    private String message;
    private String positiveButtonText;
    private String negativeButtonText;
    private GenericAlertDialogResponseInterface onResponse;
    private int alertCode;
    private View view;
    private String neutralButtonText;
    private AlertDialogBuilderProvider alertDialogBuilderProvider;
    private android.app.AlertDialog.Builder builder;
    private Object t;
    private Context context;

    public GenericAlertDialogBuilder(AlertDialogBuilderProvider alertDialogBuilderProvider) {

        this.alertDialogBuilderProvider = alertDialogBuilderProvider;
    }

    // Context should always be activity context
    public GenericAlertDialogBuilder builder(Context context) {

        if (context == null)
            throw new IllegalArgumentException("Context is null");
        if (!isRobolectricLoaded())
            this.builderV7 = alertDialogBuilderProvider.getBuilderV7(context);
        else
            this.builder = new android.app.AlertDialog.Builder(context);
        this.inflater = (LayoutInflater) context
                .getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        this.context = context;
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
            GenericAlertDialogResponseInterface response, int alertCode) {
        onResponse = response;
        this.alertCode = alertCode;
        return this;
    }

    public <T> GenericAlertDialogBuilder setParameter(T t) {

        this.t = t;
        return this;
    }

    public Dialog build() throws IllegalArgumentException {

        if ((builderV7 == null && builder == null) || inflater == null)
            throw new IllegalArgumentException("Builder or inflater is null, " +
                    "have you called builderV7() method?");
        if (title == null)
            throw new IllegalArgumentException("Since view is not null, " +
                    "and response interface is set, the response interface should be of " +
                    "type GenericAlertDialogViewResponseInterface");
        if (positiveButtonText == null)
            throw new IllegalArgumentException("Positive Text not provided");

        if (message == null && view == null) // If view is not null , there
            // is no need of message
            throw new IllegalArgumentException("Message is empty");

        if (onResponse == null)
            throw new IllegalArgumentException("On Response is null");

        if (view != null
                && !(onResponse instanceof GenericAlertDialogViewResponseInterface))
            throw new IllegalArgumentException("");

        if (!isRobolectricLoaded()) {
            builderV7.setTitle(title);
            builderV7.setMessage(message);

            if (view != null)
                builderV7.setView(view);

            builderV7.setPositiveButton(
                    positiveButtonText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (view != null)
                                ((GenericAlertDialogViewResponseInterface) onResponse)
                                        .onPositiveButtonClicked(alertCode, view, t);
                            else {
                                if (onResponse != null)
                                    onResponse.onPositiveButtonClicked(alertCode, t);
                                else {
                                    Log.w(TAG, "On response is null");
                                }
                            }
                        }
                    });
            if (negativeButtonText != null)
                builderV7.setNegativeButton(
                        negativeButtonText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (view != null)
                                    ((GenericAlertDialogViewResponseInterface) onResponse)
                                            .onNegativeButtonClicked(alertCode, view, t);
                                else {
                                    if (onResponse != null)
                                        onResponse.onNegativeButtonClicked(alertCode, t);
                                    else {
                                        Log.w(TAG, "On response is null");
                                    }

                                    if (neutralButtonText != null)
                                        builderV7.setNeutralButton(neutralButtonText,
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {

                                                        ((GenericAlertDialogWithNeutralResponseInterface) onResponse)
                                                                .onNeutralButtonPressed(alertCode);
                                                    }
                                                });
                                }
                            }
                        });
            return builderV7.create();

        } else {
            builder.setTitle(title);
            builder.setMessage(message);

            if (view != null)
                builder.setView(view);

            builder.setPositiveButton(
                    positiveButtonText,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (view != null)
                                ((GenericAlertDialogViewResponseInterface) onResponse)
                                        .onPositiveButtonClicked(alertCode, view, t);
                            else {
                                if (onResponse != null)
                                    onResponse.onPositiveButtonClicked(alertCode, t);
                                else {
                                    Log.w(TAG, "On response is null");
                                }
                            }
                        }
                    });
            if (negativeButtonText != null)
                builder.setNegativeButton(
                        negativeButtonText,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (view != null)
                                    ((GenericAlertDialogViewResponseInterface) onResponse)
                                            .onNegativeButtonClicked(alertCode, view, t);
                                else {
                                    if (onResponse != null)
                                        onResponse.onNegativeButtonClicked(alertCode, t);
                                    else {
                                        Log.w(TAG, "On response is null");
                                    }

                                    if (neutralButtonText != null)
                                        builder.setNeutralButton(neutralButtonText,
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {

                                                        ((GenericAlertDialogWithNeutralResponseInterface) onResponse)
                                                                .onNeutralButtonPressed(alertCode);
                                                    }
                                                });
                                }
                            }
                        });
            return builder.create();

        }

    }

    public GenericAlertDialogBuilder setNeutralResponse(String neutralButtonText) {
        this.neutralButtonText = neutralButtonText;
        return this;
    }

    public boolean isRobolectricLoaded() {
        try {
            Class.forName("org.robolectric.Robolectric");
        } catch (ClassNotFoundException e) {
            Log.d("Generic Alert", "RoboNot found");
            return false;
        }
        return true;
    }
}
