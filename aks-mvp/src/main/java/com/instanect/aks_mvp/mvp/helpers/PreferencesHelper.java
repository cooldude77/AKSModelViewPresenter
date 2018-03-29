package com.instanect.aks_mvp.mvp.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;

import com.google.gson.Gson;
import com.instanect.aks_mvp.mvp.interactors.preferences.interfaces.PreferencesInterface;

import java.lang.reflect.Type;

/**
 * Created by AKS on 1/31/2018.
 */

public class PreferencesHelper implements PreferencesInterface {
    private final Context context;
    private final Gson gson;

    public PreferencesHelper(Context context, Gson gson) {
        this.context = context;
        this.gson = gson;
    }

    public String getString(String preferenceName, String preferenceKey) {


        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        return sharedPreferences.getString(preferenceKey, null);
    }


    public void saveString(String preferenceName, String preferenceKey, String value) {

        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        sharedPreferences.edit()
                .putString(preferenceKey, value)
                .apply();
    }


    public Boolean getBoolean(String preferenceName, String preferenceKey) {


        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        return sharedPreferences.getBoolean(preferenceKey, false);
    }

    public void saveBoolean(String preferenceName, String preferenceKey, Boolean value) {

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

    public void removeKey(String preferenceName, String preferenceKey) {

        SharedPreferences sharedPreferences = context
                .getSharedPreferences(preferenceName, Context.MODE_PRIVATE);

        sharedPreferences.edit().remove(preferenceKey).apply();

    }

    public <T> T convertUsingClass(String jsonString, Class<T> className) {
        return gson.fromJson(jsonString, className);
    }

    public <T> T convertUsingType(String jsonString, Type typeOfT) {
        return gson.fromJson(jsonString, typeOfT);
    }

    public String convertToJSONString(Parcelable parcelable) {
        return gson.toJson(parcelable);
    }
}
