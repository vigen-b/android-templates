package org.baghdasaryan.mvpdagger2template.main;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainModule {
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenter presenter);
}
