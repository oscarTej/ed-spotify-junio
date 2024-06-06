package com.iesam.edspotify.albumes.canciones;

import com.iesam.edspotify.albumes.Album;

public class Cancion extends Album {

    public String idCancion;
    public String titulo;
    public String autor;

    public Cancion(String idAlbum, String titulo, String añoPublicacion, String listaCanciones, String idCancion, String titulo1, String autor) {
        super(idAlbum, titulo, añoPublicacion, listaCanciones);
        this.idCancion = idCancion;
        this.titulo = titulo1;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "idCancion='" + idCancion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idAlbum='" + idAlbum + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion='" + añoPublicacion + '\'' +
                ", listaCanciones='" + listaCanciones + '\'' +
                '}';
    }
}
