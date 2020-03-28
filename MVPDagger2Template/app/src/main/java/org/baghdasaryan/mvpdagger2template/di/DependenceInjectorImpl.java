package org.baghdasaryan.mvpdagger2template.di;

import org.baghdasaryan.mvpdagger2template.repository.WeatherRepository;
import org.baghdasaryan.mvpdagger2template.repository.WeatherRepositoryImpl;

public class DependenceInjectorImpl implements DependencyInjector {
    @Override
    public WeatherRepository weatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
