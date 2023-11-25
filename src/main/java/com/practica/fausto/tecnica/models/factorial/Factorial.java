package com.practica.fausto.tecnica.models.factorial;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Factorial {
    private int request;
    private Long response;
}
