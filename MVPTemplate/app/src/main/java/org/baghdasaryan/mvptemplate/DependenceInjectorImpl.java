package org.baghdasaryan.mvptemplate;

import org.baghdasaryan.mvptemplate.repository.WeatherRepository;
import org.baghdasaryan.mvptemplate.repository.WeatherRepositoryImpl;

public class DependenceInjectorImpl implements DependencyInjector {
    @Override
    public WeatherRepository weatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
