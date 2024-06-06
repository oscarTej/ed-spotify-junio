package com.iesam.edspotify.albumes;

public class Album {
    public String idAlbum;
    public String titulo;
    public String añoPublicacion;
    public String listaCanciones;

    public Album(String idAlbum, String titulo, String añoPublicacion, String listaCanciones) {
        this.idAlbum = idAlbum;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return "Album{" +
                "idAlbum='" + idAlbum + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion='" + añoPublicacion + '\'' +
                ", listaCanciones='" + listaCanciones + '\'' +
                '}';
    }
}
