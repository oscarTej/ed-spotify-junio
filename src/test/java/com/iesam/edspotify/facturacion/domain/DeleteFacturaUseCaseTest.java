package com.iesam.edspotify.facturacion.domain;

import com.iesam.edspotify.usuario.domain.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class DeleteFacturaUseCaseTest {

    @Mock

    FacturaRepository facturaRepository;
    DeleteFacturaUseCase deleteFacturaUseCase;

    @BeforeEach
    void setUp() {
        deleteFacturaUseCase = new DeleteFacturaUseCase(facturaRepository);
    }

    @AfterEach
    void tearDown() {
        deleteFacturaUseCase = null;
    }

    @Test
    void cuandoEliminoUnaFacturaSeEliminaCorrectamente() {
        String idFacutura = "123";
        Usuario usuario = new Usuario("34","Oscar","Tejerina","12/12/2023");
        Factura factura = new Factura("123",usuario, "9.9");
        Mockito.verify(facturaRepository, Mockito.times(1)).deleteFactura(idFacutura);
    }
}