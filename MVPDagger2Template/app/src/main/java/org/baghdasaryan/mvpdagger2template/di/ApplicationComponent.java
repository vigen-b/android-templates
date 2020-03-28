package org.baghdasaryan.mvpdagger2template.di;

import org.baghdasaryan.mvpdagger2template.main.MainActivity;
import org.baghdasaryan.mvpdagger2template.main.MainModule;
import org.baghdasaryan.mvpdagger2template.data.WeatherModule;
import org.baghdasaryan.mvpdagger2template.data.WeatherRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        WeatherModule.class,
        MainModule.class
})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);

    WeatherRepository getWeatherRepository();
}
