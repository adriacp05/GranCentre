package com.example.adria.grancentre;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Spinner;

public class Hotels extends AppCompatActivity implements OnItemClickListener {

    Spinner sp;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        Log.d(".-.","Start");

        sp = (Spinner) findViewById(R.id.spinnerHoteles);
        sp.setOnItemClickListener(this);
        fm = getSupportFragmentManager();


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment_hotel fh = new Fragment_hotel();
        fm.beginTransaction().replace(R.id.contenedorFragments, fh).commit();

    }
}
