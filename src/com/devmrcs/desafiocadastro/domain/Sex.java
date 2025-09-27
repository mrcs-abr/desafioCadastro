package com.devmrcs.desafiocadastro.domain;

public enum Sex {
    MACHO("Macho"),
    FEMEA("Femea");

    private final String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.sex;
    }
}
