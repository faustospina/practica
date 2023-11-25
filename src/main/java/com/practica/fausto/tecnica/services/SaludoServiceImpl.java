package com.practica.fausto.tecnica.services;

import com.practica.fausto.tecnica.models.saludo.Saludo;
import org.springframework.stereotype.Service;

@Service
public class SaludoServiceImpl implements SaludoService {
    @Override
    public Saludo generarSaludo() {
        Saludo saludo = new Saludo();
        saludo.setMensaje("FUERZA EXPRESS");
        return saludo;
    }
}
