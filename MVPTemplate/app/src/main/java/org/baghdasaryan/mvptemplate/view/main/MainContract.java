package org.baghdasaryan.mvptemplate.view.main;

import org.baghdasaryan.mvptemplate.presenter.BasePresenter;
import org.baghdasaryan.mvptemplate.view.BaseView;
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
