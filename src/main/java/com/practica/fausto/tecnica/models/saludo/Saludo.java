package com.practica.fausto.tecnica.models.saludo;


public class Saludo {
    private String mensaje;

    public Saludo(String mensaje) {
        this.mensaje = mensaje;
    }
    public Saludo() {
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = "Coordiales saludos desde el mejor equipo "+mensaje;
    }
}
