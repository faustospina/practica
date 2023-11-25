package com.practica.fausto.tecnica.controller;

import com.practica.fausto.tecnica.models.saludo.Saludo;
import com.practica.fausto.tecnica.services.SaludoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SaludoControllerTest {

    @Mock
    private SaludoService saludoService; // Asumiendo que existe un servicio SaludoService que contiene la lógica de negocio.

    @InjectMocks
    private SaludoController saludoController;

    @Test
    public void testSaludo() {
        Saludo saludoMock = new Saludo();
        saludoMock.setMensaje("FUERZA EXPRESS");
        when(saludoService.generarSaludo()).thenReturn(saludoMock);
        ResponseEntity<Object> responseEntity = saludoController.saludo();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Saludo saludoResponse = (Saludo) responseEntity.getBody();
        assertEquals("Coordiales saludos desde el mejor equipo FUERZA EXPRESS", saludoResponse.getMensaje());
    }
}