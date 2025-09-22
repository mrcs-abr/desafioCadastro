package com.devmrcs.desafiocadastro.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private int option;

    public void show() {
            Scanner sc = new Scanner(System.in);
            System.out.println("[1] - Cadastrar um novo pet");
            System.out.println("[2] - Alterar os dados do pet cadastrado");
            System.out.println("[3] - Deletar um pet cadastrado");
            System.out.println("[4] - Listar todos os pets cadastrados");
            System.out.println("[5] - Listar pets por algum critério (idade, nome, raça)");
            System.out.println("[6] - Sair");
            System.out.print("Escolha uma opção: ");
    }

    public void getUserOption() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);

        int userOption = sc.nextInt();
        this.setOption(userOption);
    }

    public int getOption(){
        return option;
    }

    public void setOption(int option) {
        if (option <= 0 || option > 6){
            throw new InputMismatchException();
        }
        this.option = option;
    }
}
