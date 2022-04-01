package com.company;

public class Gostinicha extends Dom{

    public Gostinicha(Families[] families, String address) {
        super(families, address);
    }

    @Override
    public void toloo() {
        System.out.println("Arenda toloit");
    }

    @Override
    public String toString() {
        return "Gostinicha{} " + super.toString();
    }
}
