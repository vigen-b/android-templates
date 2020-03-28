package org.baghdasaryan.mvpdagger2template.di;

import org.baghdasaryan.mvpdagger2template.repository.WeatherRepository;

public interface DependencyInjector {
    WeatherRepository weatherRepository();
}
