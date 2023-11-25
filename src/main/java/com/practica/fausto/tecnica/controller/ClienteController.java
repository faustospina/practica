package com.practica.fausto.tecnica.controller;

import com.practica.fausto.tecnica.models.cliente.TipoEnum;
import com.practica.fausto.tecnica.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api")
@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping(path = "/cliente/consultar",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> consultarCliente(@RequestParam @Validated TipoEnum tipo,@RequestParam @Validated String numDocument){
        try{
            return new ResponseEntity<>(service.obtenerCliente(tipo, numDocument), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new RuntimeException(e.getMessage()),HttpStatus.NOT_FOUND);
        }

    }
}
