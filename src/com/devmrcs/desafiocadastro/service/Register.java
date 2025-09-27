package com.devmrcs.desafiocadastro.service;

import com.devmrcs.desafiocadastro.domain.*;

import java.util.Scanner;

public class Register {
    public static void registerPet(Pet pet, Form form) {
        Scanner sc = new Scanner(System.in);

        form.readLine(0);
        String fullName = sc.nextLine().trim();
        pet.setFullName(fullName);

        form.readLine(1);
        String petType = sc.nextLine().trim().toUpperCase();
        pet.setType(Enum.valueOf(Type.class, petType));

        form.readLine(2);
        String petSex = sc.nextLine().trim().toUpperCase();
        pet.setSex(Enum.valueOf(Sex.class, petSex));

        form.readLine(3);
        System.out.print("Digite o nome da cidade: ");
        String cityName = sc.nextLine();
        System.out.print("Digite o nome da rua: ");
        String streetName = sc.nextLine();
        System.out.print("Digite o número da casa: ");
        int numberOfHouse = sc.nextInt();
        Address address = new Address(cityName, streetName, numberOfHouse);
        pet.setAddress(address);

    }
}
