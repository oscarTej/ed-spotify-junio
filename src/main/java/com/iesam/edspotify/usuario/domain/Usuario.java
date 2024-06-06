package com.iesam.edspotify.usuario.domain;

import java.util.Date;

public class Usuario {
    public  String dni;
    public  String nombre;
    public  String apellidos;
    public String fechaNacimiento;

    public Usuario(String dni, String nombre, String apellidos, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
