package com.practica.fausto.tecnica.controller;

import com.practica.fausto.tecnica.services.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/api")
@RestController
public class FactorialController {

    @Autowired
    private FactorialService service;

    @GetMapping(path = "/factorial/{numero}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getFactorial(@PathVariable int numero){
        try{
            return new ResponseEntity<>(service.getFactorial(numero), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new RuntimeException(e.getMessage()),HttpStatus.NOT_FOUND);
        }

    }

}
