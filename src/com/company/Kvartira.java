package com.company;

public class Kvartira extends Dom{

    public Kvartira(Families[] families, String address) {
        super(families, address);
    }

    @Override
    public void toloo() {
        System.out.println("Kom usluga toloit");

    }

    @Override
    public String toString() {
        return "Kvartira " + super.toString();
    }
}
