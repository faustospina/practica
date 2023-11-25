package com.practica.fausto.tecnica.services;

import com.practica.fausto.tecnica.models.cliente.Cliente;
import com.practica.fausto.tecnica.models.cliente.TipoEnum;

public interface ClienteService {

    Cliente obtenerCliente(TipoEnum tipo,String numDocumento);
}
