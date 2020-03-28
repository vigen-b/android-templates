package org.baghdasaryan.mvptemplate.di;

import org.baghdasaryan.mvptemplate.repository.WeatherRepository;
import org.baghdasaryan.mvptemplate.repository.WeatherRepositoryImpl;

public class DependenceInjectorImpl implements DependencyInjector {
    @Override
    public WeatherRepository weatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
