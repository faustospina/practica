package com.practica.fausto.tecnica.services;

import com.practica.fausto.tecnica.models.factorial.Factorial;
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
public class FactorialServiceImplTest {

    @InjectMocks
    private FactorialServiceImpl service;

    @Test
    public void testGetFactorialFive() {
        int numero = 5;
        long resultadoEsperado = 120;

        Factorial resultadoCalculado = service.getFactorial(numero);

        assertEquals(resultadoEsperado, resultadoCalculado.getResponse());
    }
    @Test
    public void testGetFactorialFour() {
        int numero = 4;
        long resultadoEsperado = 24;

        Factorial resultadoCalculado = service.getFactorial(numero);

        assertEquals(resultadoEsperado, resultadoCalculado.getResponse());
    }
}