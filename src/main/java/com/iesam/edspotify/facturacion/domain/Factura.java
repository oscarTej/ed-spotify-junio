package com.iesam.edspotify.facturacion.domain;

import com.iesam.edspotify.usuario.domain.Usuario;

import java.util.Date;

public class Factura {
    public String idFactura;
    public Usuario usuario;

    public Date fechaFacturacion;

    public String totalFacturado;

    public Factura(String idFactura, Usuario usuario,  String totalFacturado) {
        this.idFactura = idFactura;
        this.usuario = usuario;
        this.fechaFacturacion = new Date();
        this.totalFacturado = totalFacturado;
    }
    // la lista de las facturas ya creadas
    public Factura(String idFactura, Usuario usuario, Date fechaFacturacion, String totalFacturado) {
        this.idFactura = idFactura;
        this.usuario = usuario;
        this.fechaFacturacion = fechaFacturacion;
        this.totalFacturado = totalFacturado;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", usuario=" + usuario +
                ", fechaFacturacion=" + fechaFacturacion +
                ", totalFacturado='" + totalFacturado + '\'' +
                '}';
    }
}
