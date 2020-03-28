package org.baghdasaryan.mvpdagger2template.main;

import org.baghdasaryan.mvpdagger2template.data.model.Rain;
import org.baghdasaryan.mvpdagger2template.data.model.Weather;
import org.baghdasaryan.mvpdagger2template.data.WeatherRepository;
import org.baghdasaryan.mvpdagger2template.data.model.WeatherState;

import javax.inject.Inject;

import androidx.annotation.Nullable;

public class MainPresenter implements MainContract.Presenter {

    @Nullable
    private MainContract.View view;
    private WeatherRepository weatherRepository;

    @Inject
    public MainPresenter(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
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
    public void takeView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }
}
