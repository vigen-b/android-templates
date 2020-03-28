package org.baghdasaryan.mvpdagger2template.main;

import org.baghdasaryan.mvpdagger2template.common.BasePresenter;
import org.baghdasaryan.mvpdagger2template.common.BaseView;
import org.baghdasaryan.mvpdagger2template.data.model.WeatherState;

public interface MainContract {
    interface Presenter extends BasePresenter<View> {
        void onViewCreated();
        void onLoadWeatherTapped();
        void takeView(MainContract.View view);
    }

    interface View extends BaseView<Presenter> {
        void displayWeatherState(WeatherState weatherState);
    }
}
