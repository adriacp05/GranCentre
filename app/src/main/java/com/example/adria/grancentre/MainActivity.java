package com.example.adria.grancentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button business;
    Button events;
    Button hotels;
    Button movies;
    Button restaurants;
    Button weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        business = findViewById(R.id.btBusinesses);
        events = findViewById(R.id.btEvents);
        hotels = findViewById(R.id.btHotels);
        movies = findViewById(R.id.btMovies);
        restaurants = findViewById(R.id.btRestaurants);
        weather = findViewById(R.id.btWeather);
    }


    public void onClick(View v) {

        if (v == business) startActivity(new Intent(this, Businesses.class));
        else if (v == events) startActivity(new Intent(this, events.class));
        else if (v == hotels) startActivity(new Intent(this, Hotels.class));
        else if (v == movies) startActivity(new Intent(this, Movies.class));
        else if (v == restaurants) startActivity(new Intent(this, Restaurants.class));
        else if (v == weather) startActivity(new Intent(this, Weather.class));
        else Toast.makeText(getApplicationContext(), v.toString(), Toast.LENGTH_LONG).show();
    }
}
