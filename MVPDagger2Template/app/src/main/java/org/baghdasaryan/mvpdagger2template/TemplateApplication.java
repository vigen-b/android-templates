package org.baghdasaryan.mvpdagger2template;

import android.app.Application;

import org.baghdasaryan.mvpdagger2template.di.ApplicationComponent;
import org.baghdasaryan.mvpdagger2template.di.DaggerApplicationComponent;

public class TemplateApplication extends Application {
    ApplicationComponent appComponent = DaggerApplicationComponent.create();

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }
}
