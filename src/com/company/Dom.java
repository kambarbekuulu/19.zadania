package com.company;

import java.util.Arrays;

public  abstract  class Dom {
    private Families[]families;
    private String address;

    public Dom(Families[] families, String address) {
        this.families = families;
        this.address = address;
    }
    public abstract  void  toloo();

    @Override
    public String toString() {
        return "{" +
                "families=" + Arrays.toString(families) +
                ", address='" + address + '\'' +
                '}';
    }
}

