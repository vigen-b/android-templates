package org.baghdasaryan.mvptemplate.repository;

import com.google.gson.Gson;

import org.baghdasaryan.mvptemplate.repository.model.Weather;

import java.util.Random;

public class WeatherRepositoryImpl implements WeatherRepository {

    private static final String JSON_SUN = "{\"id\":804,\"main\":\"clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\", \"rain\":{\"amount\":20},\"clouds\":{\"all\":92}, \"wind\":{\"speed\":7.31,\"deg\":187.002}, \"temp\":289.5,\"humidity\":89,\"pressure\":1013,\"temp_min\":287.04,\"temp_max\":292.04}";
    private static final String JSON_RAIN = "{\"id\":804,\"main\":\"sunny\",\"description\":\"sunny\",\"icon\":\"04n\", \"rain\":{\"amount\":0},\"clouds\":{\"all\":92}, \"wind\":{\"speed\":7.31,\"deg\":187.002}, \"temp\":289.5,\"humidity\":89,\"pressure\":1013,\"temp_min\":287.04,\"temp_max\":292.04}";


    @Override
    public Weather loadWeather() {
        Random r = new Random();
        boolean isSunny = r.nextBoolean();
        String json = isSunny ? JSON_SUN : JSON_RAIN;
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        return weather;
    }
}
