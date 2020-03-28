package org.baghdasaryan.mvpdagger2template.data;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class WeatherModule {
    @Singleton
    @Provides
    public WeatherRepository providesWeatherRepository() {
        return new WeatherRepositoryImpl();
    }
}
