package com.example.adria.grancentre;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private Spinner sp;
    private FragmentManager fm;
    private Fragment fr;
    private final String [] ESTRELLAS = {"*","**","***","****","*****"};

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //ArrayAdapter adaptador = new ArrayAdapter<String> (this,
        //      android.R.layout.simple_spinner_dropdown_item, ESTRELLAS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        //Log.d(".-.","Start");
        sp = (Spinner) findViewById(R.id.spinnerHoteles);
        sp.setOnItemSelectedListener(this);
        fm = getFragmentManager();
        //fm.beginTransaction().add(R.id.contenedorFragments,new fr_hotel_1());


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        switch (position) {
            case 0:
                fr = new fr_hotel_1();
                break;
            case 1:
                fr = new fr_hotel_2();
                //tv = (TextView) fr.getView().findViewById(R.id.fr_hotel21_calle);
                //tv.setOnClickListener(this);
                break;
            case 2:
                fr = new fr_hotel_3();
                break;
            case 3:
                fr = new fr_hotel_4();
                break;
            case 4:
                fr = new fr_hotel_5();
                break;
        }

        fm.beginTransaction().replace(R.id.contenedorFragments,fr).commit();

        Toast.makeText(this, Integer.toString(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        /*
        int id = v.getId();
        Intent i;

        switch (id) {
            case R.id.fr_hotel21_calle:
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse("geo:Turó Bruguet, 2, 08402 Granollers, España"));
        }
        */
    }
}
