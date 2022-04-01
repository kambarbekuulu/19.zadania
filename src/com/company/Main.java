package com.company;

public class Main {

    public static void main(String[] args) {

    Person father = new Person("aibek",40);
    Person son = new Person("Nutbek",10);
    Person mother = new Person("Aigul",39);
    Person grandfaher = new Person("Babai",100);
    Families families = new Families(new Person[]{father,son,mother,grandfaher},"Imarovdor");
    Kvartira kvartira = new Kvartira(new Families[]{families},"Melnikova 3k2");
    Families families1 = new Families(new Person[]{mother,father},"Aidorovtor");
    Gostinicha gostinicha = new Gostinicha(new Families[]{families},"Taininskaia 26");
    Families families2 = new Families(new Person[]{grandfaher,son},"Kamalovtor");
    Obshijitia obshijitia = new Obshijitia(new Families[]{families2},"Praspekt Mira");
        System.out.println(obshijitia);
        obshijitia.toloo();
        System.out.println("Obshijitiada ushuncha adam jashait:");
        families2.sany();
        System.out.println("----------------------------------");
        System.out.println(kvartira );
        kvartira.toloo();
        System.out.println("Kvartirada ushuncha adam jashait:");
        families.sany();
        System.out.println("----------------------------------");
        System.out.println(gostinicha);
        gostinicha.toloo();
        System.out.println("Gostinisada ushuncha adam jashait:");
        families1.sany();
        System.out.println("------------------------------------");



    }
   }







