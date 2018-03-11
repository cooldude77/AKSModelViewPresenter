package com.instanect.aks_mvp.mvp.interactors;

import com.instanect.mainapp.layers.business.generic.resources.AppResourceGetter;
import com.instanect.mainapp.layers.business.mvp.interactors.alert.AbstractAlertDialog;
import com.instanect.mainapp.layers.ui.alert.GenericAlertDialogBuilder;

/**
 * Created by AKS on 12/14/2017.
 */

public class GenericAlertDialogInteractor extends AbstractAlertDialog {
    public GenericAlertDialogInteractor(AppResourceGetter appResourceGetter, GenericAlertDialogBuilder genericAlertDialogBuilder) {
        super(appResourceGetter, genericAlertDialogBuilder);
    }
}
