package com.devmrcs.desafiocadastro.domain;

import java.io.*;

public class Form {
    private String[] questions = {
            "1 - Qual o nome e sobrenome do pet?",
            "2 - Qual o tipo do pet (Cachorro/Gato)?",
            "3 - Qual o sexo do animal?",
            "4 - Qual endereço e bairro que ele foi encontrado?",
            "5 - Qual a idade aproximada do pet?",
            "6 - Qual o peso aproximado do pet?",
            "7 - Qual a raça do pet?"
    };

    public void read() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("formulario.txt")))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void create() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("formulario.txt")))) {
            for (String question: this.questions) {
                bw.write(question);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
