package com.devmrcs.desafiocadastro.test;

import com.devmrcs.desafiocadastro.dominio.Formulario;

import java.io.IOException;

public class FormularioTest01 {
    public static void main(String[] args) {
        Formulario form = new Formulario();

        try {
            form.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            form.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
