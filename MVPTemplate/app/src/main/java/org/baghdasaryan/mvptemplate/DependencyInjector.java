package org.baghdasaryan.mvptemplate;

import org.baghdasaryan.mvptemplate.repository.WeatherRepository;

public interface DependencyInjector {
    WeatherRepository weatherRepository();
}
