package org.baghdasaryan.mvpdagger2template.di;

import org.baghdasaryan.mvpdagger2template.data.WeatherRepository;
import org.baghdasaryan.mvpdagger2template.data.WeatherRepositoryImpl;

public class DependenceInjectorImpl implements DependencyInjector {
    @Override
    public WeatherRepository weatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
