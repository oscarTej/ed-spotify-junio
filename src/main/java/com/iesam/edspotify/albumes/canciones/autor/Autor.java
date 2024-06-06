package com.iesam.edspotify.albumes.canciones.autor;

import com.iesam.edspotify.albumes.canciones.Cancion;

public class Autor extends Cancion {

    public String id;
    public String nombre;
    public String apellidos;


    public Autor(String idAlbum, String titulo, String añoPublicacion, String listaCanciones, String idCancion, String titulo1, String autor, String id, String nombre, String apellidos) {
        super(idAlbum, titulo, añoPublicacion, listaCanciones, idCancion, titulo1, autor);
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", idCancion='" + idCancion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idAlbum='" + idAlbum + '\'' +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion='" + añoPublicacion + '\'' +
                ", listaCanciones='" + listaCanciones + '\'' +
                '}';
    }
}