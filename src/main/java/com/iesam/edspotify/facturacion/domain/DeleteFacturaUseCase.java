package com.iesam.edspotify.facturacion.domain;

public class DeleteFacturaUseCase {
    FacturaRepository facturaRepository;

    public DeleteFacturaUseCase(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public void execute(String idFactura){

        facturaRepository.deleteFactura(idFactura);
    }
}
