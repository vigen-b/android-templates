package org.baghdasaryan.mvpdagger2template.presenter;

import org.baghdasaryan.mvpdagger2template.main.MainPresenter;
import org.baghdasaryan.mvpdagger2template.data.WeatherRepository;
import org.baghdasaryan.mvpdagger2template.data.model.Rain;
import org.baghdasaryan.mvpdagger2template.data.model.Weather;
import org.baghdasaryan.mvpdagger2template.data.model.WeatherState;
import org.baghdasaryan.mvpdagger2template.main.MainContract;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    private MainContract.View mockMainActivity;

    private MainPresenter presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(new StubWeatherRepository());
        presenter.takeView(mockMainActivity);
    }

    @After
    public void tearDown() {
        if (presenter != null) {
            presenter.dropView();
        }
    }

    @Test
    public void testOnViewCreatedFlow() {
        presenter.onViewCreated();
        verify(mockMainActivity).displayWeatherState(WeatherState.RAIN);
    }

}

class StubWeatherRepository implements WeatherRepository {

    @Override
    public Weather loadWeather() {
        Weather weather = new Weather();
        Rain rain = new Rain();
        rain.setAmount(10);
        weather.setRain(rain);
        return weather;
    }
}
