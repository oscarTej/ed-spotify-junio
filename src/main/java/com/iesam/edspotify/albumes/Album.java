package com.iesam.edspotify.albumes;

import com.iesam.edspotify.albumes.canciones.Cancion;

public class Album  {
    public String idAlbum;
    public String titulo;
    public String anioPublicacion;
    public String listaCanciones;

    public Album(String idAlbum, String titulo, String anioPublicacion, String listaCanciones) {
        this.idAlbum = idAlbum;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.listaCanciones = listaCanciones;
    }



    @Override
    public String toString() {
        return "Album{" +
                "idAlbum='" + idAlbum + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion='" + anioPublicacion + '\'' +
                ", listaCanciones='" + listaCanciones + '\'' +
                '}';
    }
}
