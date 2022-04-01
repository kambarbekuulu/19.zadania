package com.company;

public class Obshijitia extends Dom {

    public Obshijitia(Families[] families, String address) {
        super(families, address);
    }

    @Override
    public void toloo() {
        System.out.println("Arenda toloit");

    }

    @Override
    public String toString() {
        return "Obshijitia{} " + super.toString();
    }
}