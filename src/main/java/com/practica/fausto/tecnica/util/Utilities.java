package com.practica.fausto.tecnica.util;

import com.practica.fausto.tecnica.models.cliente.Cliente;
import com.practica.fausto.tecnica.models.cliente.TipoEnum;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static Cliente clientesDisponible(TipoEnum tipo,String numDocumento){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(Cliente
                .builder()
                .numDocumento("23445322")
                        .primerNombre("Oscar")
                        .segundoNombre("Javier")
                        .primerApellido("Rojas")
                        .segundoApellido("Tapias")
                        .telefono("7689045")
                        .ciudadResidencia("Armennia")
                        .direccion("Calle 48#33-65")
                        .tipo(TipoEnum.C)
                .build());

        clientes.add(Cliente
                .builder()
                .numDocumento("12168970")
                .primerNombre("Andres")
                .segundoNombre("Julian")
                .primerApellido("Cano")
                .segundoApellido("Calvo")
                .telefono("563539")
                .ciudadResidencia("Medellin")
                .direccion("Calle 30A #80-43")
                .tipo(TipoEnum.P)
                .build());
        return clientes
                .stream()
                .filter(cliente->cliente.getTipo().equals(tipo)&&cliente.getNumDocumento().equals(numDocumento))
                .findAny().orElseThrow(()->new RuntimeException("No se encontro el cliente"));
    }

}
