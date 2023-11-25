package com.practica.fausto.tecnica.controller;

import com.practica.fausto.tecnica.services.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api")
@RestController
public class SaludoController {
    @Autowired
    private SaludoService service;

    @GetMapping(path = "/hola",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saludo(){
        try{

            return new ResponseEntity<>(service.generarSaludo(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new RuntimeException(e.getMessage()),HttpStatus.NOT_FOUND);
        }

    }
}
