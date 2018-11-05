package com.example.adria.grancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fr_hotel_3 extends Fragment implements View.OnClickListener {

    private TextView[] tv = new TextView[6];

    public fr_hotel_3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fr_hotel_3, container, false);

        tv[0] = (TextView) v.findViewById(R.id.fr_hotel31_calle);
        tv[1] = (TextView) v.findViewById(R.id.fr_hotel31_numero);
        tv[2] = (TextView) v.findViewById(R.id.fr_hotel31_web);
        tv[3] = (TextView) v.findViewById(R.id.fr_hotel32_calle);
        tv[4] = (TextView) v.findViewById(R.id.fr_hotel32_numero);
        tv[5] = (TextView) v.findViewById(R.id.fr_hotel32_web);


        for (int i=0;i<tv.length;i++){
            tv[i].setOnClickListener(this);
        }


        return v;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i=null;
        String cadena;

        switch (id) {
            case R.id.fr_hotel31_calle:
                cadena = tv[0].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse("geo:0,0?q="+cadena));
                break;
            case R.id.fr_hotel31_numero:
                cadena = tv[1].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse("tel:"+cadena));
                break;
            case R.id.fr_hotel31_web:
                cadena = tv[2].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse(cadena));
                break;
            case R.id.fr_hotel32_calle:
                cadena = tv[3].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse("geo:0,0?q="+cadena));
                break;
            case R.id.fr_hotel32_numero:
                cadena = tv[4].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse("tel:"+cadena));
                break;
            case R.id.fr_hotel32_web:
                cadena = tv[5].getText().toString();
                i=new Intent ("android.intent.action.VIEW",
                        Uri.parse(cadena));
                break;
        }


        startActivity(i);
    }
}
