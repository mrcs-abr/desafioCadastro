package com.devmrcs.desafiocadastro.domain;

public enum Type {
    CACHORRO("Cachorro"),
    GATO("Gato");

    private final String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
