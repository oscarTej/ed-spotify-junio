package com.iesam.edspotify.facturacion.presentation;

import com.iesam.edspotify.facturacion.data.FacturacionDataRepository;
import com.iesam.edspotify.facturacion.data.local.FacturaFileLocalDataSource;
import com.iesam.edspotify.facturacion.domain.DeleteFacturaUseCase;
import com.iesam.edspotify.facturacion.domain.Factura;
import com.iesam.edspotify.facturacion.domain.FacturaRepository;
import com.iesam.edspotify.facturacion.domain.SaveFacturaUseCase;
import com.iesam.edspotify.usuario.domain.Usuario;

import java.util.Scanner;

public class FacturaPresentation {

    static Scanner input = new Scanner(System.in);

    public static void saveFactura() {

        SaveFacturaUseCase saveFacturaUseCase = new SaveFacturaUseCase(
                new FacturacionDataRepository(new FacturaFileLocalDataSource()));

        Usuario usuario = new Usuario("1876","Gonzalo","sanchez","23/3/1984");
        Factura factura = new Factura("64",usuario,"9,90");
        saveFacturaUseCase.execute(factura);

        System.out.println(factura);

    }

    public static void deleteFactura(){
        System.out.println("digame el id de la compra");

        String id = input.next();

        DeleteFacturaUseCase deleteFacturaUseCase = new DeleteFacturaUseCase(
                new FacturacionDataRepository(new FacturaFileLocalDataSource()));
        deleteFacturaUseCase.execute(id);

        System.out.println("se ha borrado su factura correctamente ");
    }
}

