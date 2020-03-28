package org.baghdasaryan.mvpdagger2template.data;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class WeatherModule {
    @Singleton
    @Binds
    public abstract WeatherRepository providesWeatherRepository(WeatherRepositoryImpl weatherRepository);
}
