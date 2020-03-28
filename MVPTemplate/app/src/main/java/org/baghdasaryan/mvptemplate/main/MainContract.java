package org.baghdasaryan.mvptemplate.main;

import org.baghdasaryan.mvptemplate.common.BasePresenter;
import org.baghdasaryan.mvptemplate.common.BaseView;
import org.baghdasaryan.mvptemplate.repository.model.WeatherState;

public interface MainContract {
    interface Presenter extends BasePresenter {
        void onViewCreated();
        void onLoadWeatherTapped();
    }

    interface View extends BaseView<Presenter> {
        void displayWeatherState(WeatherState weatherState);
    }
}
