package org.baghdasaryan.mvpdagger2template.di;

import org.baghdasaryan.mvpdagger2template.data.WeatherRepository;

public interface DependencyInjector {
    WeatherRepository weatherRepository();
}
