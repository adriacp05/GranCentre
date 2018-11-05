package com.example.adria.grancentre;

public class Hotel_ListView {
    private int idImagen;
    private String nombre;
    private String telefono;
    private String web;
    private String estrellas;
    private String direccion;

    public Hotel_ListView (String [] datos) {
        this.idImagen = Integer.parseInt(datos [4]);
        this.nombre = datos [0];
        this.telefono = datos[2];
        this.web = datos[1];
        this.estrellas=datos[5];
        this.direccion=datos[3];
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstrellas() {
        return estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getWeb() {
        return web;
    }

    public int getIdImagen() {
        return idImagen;
    }
}
