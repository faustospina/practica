package com.practica.fausto.tecnica.services;

import com.practica.fausto.tecnica.models.cliente.Cliente;
import com.practica.fausto.tecnica.models.cliente.TipoEnum;
import com.practica.fausto.tecnica.util.Utilities;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Override
    public Cliente obtenerCliente(TipoEnum tipo, String numDocumento) {

        return Utilities.clientesDisponible(tipo,numDocumento);
    }
}
