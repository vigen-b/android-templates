package org.baghdasaryan.mvptemplate.di;

import org.baghdasaryan.mvptemplate.repository.WeatherRepository;

public interface DependencyInjector {
    WeatherRepository weatherRepository();
}
