package com.iesam;

import com.iesam.edspotify.facturacion.presentation.FacturaPresentation;
import com.iesam.edspotify.usuario.presentation.UsuarioPresentation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        UsuarioPresentation.saveUsuario();
        UsuarioPresentation.getUsuarios();
        UsuarioPresentation.deleteusuario();

        FacturaPresentation.deleteFactura();
        FacturaPresentation.saveFactura();


    }
}
