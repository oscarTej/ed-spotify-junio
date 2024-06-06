package com.iesam.edspotify.facturacion.data;

import com.iesam.edspotify.facturacion.data.local.FacturaFileLocalDataSource;
import com.iesam.edspotify.facturacion.domain.Factura;
import com.iesam.edspotify.facturacion.domain.FacturaRepository;

public class FacturacionDataRepository  implements FacturaRepository {

    FacturaFileLocalDataSource facturaFileLocalDataSource;

    public FacturacionDataRepository(FacturaFileLocalDataSource facturaFileLocalDataSource) {
        this.facturaFileLocalDataSource = facturaFileLocalDataSource;
    }

    @Override
    public void saveFactura(Factura factura) {

        facturaFileLocalDataSource.save(factura);

    }

    @Override
    public void deleteFactura(String idFactura) {
        facturaFileLocalDataSource.delete(idFactura);
    }
}
