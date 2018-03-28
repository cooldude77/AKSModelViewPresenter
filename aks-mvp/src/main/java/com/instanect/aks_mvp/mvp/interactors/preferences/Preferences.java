package com.instanect.aks_mvp.mvp.interactors.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInterface;

/**
 * Created by AKS on 11/9/2017.
 */

public class Preferences implements PreferencesInterface {

    protected final Context context;
    protected final Gson gson;

    public Preferences(Context context, Gson gson) {

        this.context = context;
        this.gson = gson;
    }

    protected String getString(String preferenceName, String preferenceKey) {


        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        return sharedPreferences.getString(preferenceKey, null);
    }


    protected void saveString(String preferenceName, String preferenceKey, String value) {

        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        sharedPreferences.edit()
                .putString(preferenceKey, value)
                .apply();
    }

    protected void saveBoolean(String preferenceName, String preferenceKey, Boolean value) {

        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        sharedPreferences.edit()
                .putBoolean(preferenceKey, value)
                .apply();
    }

    public void clearSharedPreference(String preferenceName) {

        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        sharedPreferences.edit()
                .clear().apply();

    }

}
