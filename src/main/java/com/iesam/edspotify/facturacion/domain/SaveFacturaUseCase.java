package com.iesam.edspotify.facturacion.domain;

import com.iesam.edspotify.usuario.domain.Usuario;

public class SaveFacturaUseCase {

    FacturaRepository facturaRepository;

    public SaveFacturaUseCase(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public void execute(Factura factura){
        facturaRepository.saveFactura(factura);
    }
}
