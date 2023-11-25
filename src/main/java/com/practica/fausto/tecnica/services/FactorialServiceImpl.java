package com.practica.fausto.tecnica.services;

import com.practica.fausto.tecnica.models.factorial.Factorial;
import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService{
    private long factorialResult = -1;
    @Override
    public Factorial getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial solo está definido para números no negativos.");
        }

        if (factorialResult == -1) {
            factorialResult = calculateFactorial(n);
        }

        return Factorial.builder().request(n).response(factorialResult).build();
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

}
