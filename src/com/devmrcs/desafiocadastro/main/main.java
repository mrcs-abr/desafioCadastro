package com.devmrcs.desafiocadastro.main;

import com.devmrcs.desafiocadastro.domain.Form;
import com.devmrcs.desafiocadastro.domain.Menu;
import com.devmrcs.desafiocadastro.domain.Pet;
import com.devmrcs.desafiocadastro.service.Register;

import java.io.IOException;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {
        Form form = new Form();
        Menu menu = new Menu();

        try {
            form.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            menu.show();
            try {
                menu.getUserOption();
            } catch (InputMismatchException e) {
                System.out.println("Opção invalida, tente novamente!");
            }

            boolean closeSession = false;
            switch (menu.getOption()) {
                case 1:
                    Register.registerPet(new Pet(), form);
                    break;
                case 2:
                    System.out.println("Em construcao");
                    break;
                case 3:
                    System.out.println("Em construcao");
                    break;
                case 4:
                    System.out.println("Em construcao");
                    break;
                case 5:
                    System.out.println("Em construcao");
                    break;
                case 6:
                    closeSession = true;
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;
            }

            if (closeSession) break;

        }

    }
}
