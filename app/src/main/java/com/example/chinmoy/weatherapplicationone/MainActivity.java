package com.example.chinmoy.weatherapplicationone;

        import android.support.v4.app.FragmentTransaction;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    WeatherFragment weatherFragment;
    MenuFragment menuFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherFragment = new WeatherFragment();
        menuFragment = new MenuFragment();

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.message_fragment, weatherFragment);
        transaction.add(R.id.send_fragment, menuFragment);

        transaction.commit();

    }
}
