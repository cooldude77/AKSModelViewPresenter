package com.instanect.aks_mvp.mvp.view.factory;

import android.content.Context;
import android.view.View;

import com.instanect.aks_mvp.mvp.view.helper.AppViewHelper;
import com.instanect.aks_mvp.mvp.view.interfaces.ViewInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * ViewFactory for creating views in activity/fragment
 */

public class ViewFactory {
    public <T extends ViewInterface> ViewInterface
    getInstance(
            Class<? extends ViewInterface> T,
            Context context)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {
        Class[] args = new Class[1];
        args[0] = AppViewHelper.class;

        return T.getDeclaredConstructor(args).newInstance(
                new AppViewHelper(context)
        );
    }
}
