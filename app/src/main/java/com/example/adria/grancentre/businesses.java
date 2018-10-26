package com.example.adria.grancentre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class businesses extends AppCompatActivity {

    public Button bttTiendas, bttRestaurantes, bttOcio, bttServicios;
    public TextView empTitulo1, empTexto1, empTelefono1, empTitulo2, empTexto2, empTelefono2, empTitulo3, empTexto3, empTelefono3;
    public ImageView empImagen1, empImagen2, empImagen3;
    public GridLayout areaEmpresas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_businesses);

        bttTiendas = findViewById(R.id.bttTiendas);
        bttRestaurantes = findViewById(R.id.bttRestaurantes);
        bttOcio = findViewById(R.id.bttOcio);
        bttServicios = findViewById(R.id.bttServicios);
        empTitulo1 = findViewById(R.id.empTitulo1);
        empTexto1 = findViewById(R.id.empTexto1);
        empTelefono1 = findViewById(R.id.empTelefono1);
        empImagen1 = findViewById(R.id.empImagen1);
        empTitulo2 = findViewById(R.id.empTitulo2);
        empTexto2 = findViewById(R.id.empTexto2);
        empTelefono2 = findViewById(R.id.empTelefono2);
        empImagen2 = findViewById(R.id.empImagen2);
        empTitulo3 = findViewById(R.id.empTitulo3);
        empTexto3 = findViewById(R.id.empTexto3);
        empTelefono3 = findViewById(R.id.empTelefono3);
        empImagen3 = findViewById(R.id.empImagen3);
        areaEmpresas = findViewById(R.id.areaEmpresas);


    }


    public void onClick(View v) {

        if (v == bttTiendas) {

            areaEmpresas.setBackgroundColor(0xffffeebb);

            empTitulo1.setText("Jugueteria Camillo");
            empTexto1.setText("Tienda de juguetes para niños de 0 a 12 años.");
            empTelefono1.setText("901 22 54 85");
            empImagen1.setImageResource(R.drawable.tienda1);

            empTitulo2.setText("Tzara");
            empTexto2.setText("Tienda de ropa de invierno para todas las personas");
            empTelefono2.setText("921 81 45 75");
            empImagen2.setImageResource(R.drawable.tienda2);

            empTitulo3.setText("Supermercado Eurosky");
            empTexto3.setText("Gran supermercado de la cadena Eurosky");
            empTelefono3.setText("903 77 88 99");
            empImagen3.setImageResource(R.drawable.tienda3);

        } else
        if (v == bttRestaurantes) {

            areaEmpresas.setBackgroundColor(0xffffb2bc);

            empTitulo1.setText("Restaurante Cal Vicente");
            empTexto1.setText("Restaurante de comida mediterranea, desde 1994");
            empTelefono1.setText("902 15 48 73");
            empImagen1.setImageResource(R.drawable.restaurante1);

            empTitulo2.setText("Pizzeria Menito Bussolinni");
            empTexto2.setText("Pizzeria familiar con opcion de comida para llevar");
            empTelefono2.setText("966 54 87 78");
            empImagen2.setImageResource(R.drawable.restaurante2);

            empTitulo3.setText("Cafeteria Ana");
            empTexto3.setText("Cafeteria-Fleca con desayunos y meriendas, para el trabajador sin tiempo");
            empTelefono3.setText("902 21 25 29");
            empImagen3.setImageResource(R.drawable.restaurante3);

        } else
        if (v == bttOcio) {

            areaEmpresas.setBackgroundColor(0xffd2ceff);

            empTitulo1.setText("Multicine OocioO");
            empTexto1.setText("Cine con cartelera actualizada que tambien ofrece peliculas mas clasicas");
            empTelefono1.setText("902 26 25 54");
            empImagen1.setImageResource(R.drawable.ocio1);

            empTitulo2.setText("Bolera Strike");
            empTexto2.setText("Bolera con un pequeño centro de ocio que incluye billar y air hockey");
            empTelefono2.setText("941 41 41 41");
            empImagen2.setImageResource(R.drawable.ocio2);

            empTitulo3.setText("Karting Crashing");
            empTexto3.setText("Circuitos de karts para toda la familia con precios asequibles");
            empTelefono3.setText("936 65 51 14");
            empImagen3.setImageResource(R.drawable.ocio3);

        } else
        if (v == bttServicios) {

            areaEmpresas.setBackgroundColor(0xffb6d58f);

            empTitulo1.setText("Farmacia Santa Susana");
            empTexto1.setText("Farmacia oficial abierta las 24 horas, viernes cerrada");
            empTelefono1.setText("921 28 21 29");
            empImagen1.setImageResource(R.drawable.servicio1);

            empTitulo2.setText("Gasolinera Repsol");
            empTexto2.setText("Gasolinera de la cadena Respol");
            empTelefono2.setText("925 58 82 25");
            empImagen2.setImageResource(R.drawable.servicio2);

            empTitulo3.setText("");
            empTexto3.setText("");
            empTelefono3.setText("");
            empImagen3.setImageResource(android.R.color.transparent);

        }
    }



}

