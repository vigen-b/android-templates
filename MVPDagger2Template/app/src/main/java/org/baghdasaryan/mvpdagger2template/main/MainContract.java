package org.baghdasaryan.mvpdagger2template.main;

import org.baghdasaryan.mvpdagger2template.common.BasePresenter;
import org.baghdasaryan.mvpdagger2template.common.BaseView;
import org.baghdasaryan.mvpdagger2template.repository.model.WeatherState;

public interface MainContract {
    interface Presenter extends BasePresenter {
        void onViewCreated();
        void onLoadWeatherTapped();
    }

    interface View extends BaseView<Presenter> {
        void displayWeatherState(WeatherState weatherState);
    }
}
