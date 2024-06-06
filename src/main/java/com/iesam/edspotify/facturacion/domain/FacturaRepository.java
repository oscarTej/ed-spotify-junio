package com.iesam.edspotify.facturacion.domain;

public interface FacturaRepository {
    void saveFactura(Factura factura);

    void deleteFactura(String idFactura);
}
