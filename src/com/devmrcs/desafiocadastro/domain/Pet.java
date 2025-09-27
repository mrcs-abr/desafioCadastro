package com.devmrcs.desafiocadastro.domain;

public class Pet {
    private String fullName;
    private Type type;
    private Sex sex;
    private Address address;
    private float age;
    private float weight;
    private String breed;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String regex = "([a-zA-Z])+\\s([a-zA-Z]+\\s?)+$";

        if (!(fullName.matches(regex))) {
            throw new RuntimeException("O pet deve possuir nome e sobrenome");
        }
        this.fullName = fullName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
