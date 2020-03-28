package org.baghdasaryan.mvpdagger2template.main;

import org.baghdasaryan.mvpdagger2template.di.DependencyInjector;
import org.baghdasaryan.mvpdagger2template.repository.model.Rain;
import org.baghdasaryan.mvpdagger2template.repository.model.Weather;
import org.baghdasaryan.mvpdagger2template.repository.WeatherRepository;
import org.baghdasaryan.mvpdagger2template.repository.model.WeatherState;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    private WeatherRepository weatherRepository;

    public MainPresenter(MainContract.View v, DependencyInjector di) {
        view = v;
        weatherRepository = di.weatherRepository();
    }

    @Override
    public void onViewCreated() {
        loadWeather();
    }

    @Override
    public void onLoadWeatherTapped() {
        loadWeather();
    }

    private void loadWeather() {
        Weather weather = weatherRepository.loadWeather();
        WeatherState weatherState = weatherStateForWeather(weather);

        if (view != null) {
            view.displayWeatherState(weatherState);
        }
    }

    private WeatherState weatherStateForWeather(Weather weather) {
        Rain rain = weather.getRain();
        if (rain != null && rain.getAmount() > 0) {
            return WeatherState.RAIN;
        }
        return WeatherState.SUN;
    }

    @Override
    public void onDestroy() {
        view = null;
    }
}
