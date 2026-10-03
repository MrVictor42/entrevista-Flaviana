package com.entrevista.flaviana.exception;

public class EmailJaRegistradoException extends  RuntimeException {
    public EmailJaRegistradoException(String mensagem) {
        super(mensagem);
    }
}