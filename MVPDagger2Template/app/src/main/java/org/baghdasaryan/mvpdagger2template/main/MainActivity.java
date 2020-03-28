package org.baghdasaryan.mvpdagger2template.main;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.baghdasaryan.mvpdagger2template.TemplateApplication;
import org.baghdasaryan.mvpdagger2template.R;
import org.baghdasaryan.mvpdagger2template.data.model.WeatherState;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((TemplateApplication) getApplicationContext()).getAppComponent().inject(this);
        presenter.takeView(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        presenter.onViewCreated();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onLoadWeatherTapped();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        presenter.dropView();
        super.onDestroy();
    }

    @Override
    public void displayWeatherState(WeatherState weatherState) {
        Drawable drawable = getResources().getDrawable(weatherDrawableResId(weatherState), getTheme());
        imageView.setImageDrawable(drawable);
    }

    private int weatherDrawableResId(WeatherState weatherState) {
        int resId;
        switch (weatherState) {
            case SUN:
                resId = R.drawable.ic_sun;
                break;
            case RAIN:
                resId = R.drawable.ic_umbrella;
                break;
            default:
                throw new IllegalStateException("Unknown weather state");
        }
        return resId;
    }
}
