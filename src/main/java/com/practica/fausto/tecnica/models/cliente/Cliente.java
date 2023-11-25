package com.practica.fausto.tecnica.models.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String primerNombre,
            segundoNombre,
            primerApellido,
            segundoApellido,
            telefono,
            direccion,
            ciudadResidencia,
            numDocumento;
    private TipoEnum tipo;

}
