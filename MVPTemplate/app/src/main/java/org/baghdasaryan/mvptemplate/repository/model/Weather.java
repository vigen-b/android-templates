package org.baghdasaryan.mvptemplate.repository.model;

public class Weather {
    private String id;
    private String main;
    private String description;
    private String icon;
    private Rain rain;
    private Clouds clouds;
    private Wind wind;
    private float temp;
    private int humidity;
    private int pressure;
    private float tempMin;
    private float tempMax;

    public Weather() {}

    public String getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public Rain getRain() {
        return rain;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public float getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public float getTempMin() {
        return tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
}
