package com.aluracursos.screenmatch.exceptions;

public class ErrorDuracionNoEstablecidaException extends RuntimeException {
    private String mensaje;

    public ErrorDuracionNoEstablecidaException(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
