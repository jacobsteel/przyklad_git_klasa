package org.example;

import Klasy.Osoba;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Adam", "Kowalski");
        System.out.println(osoba.getInfo());
        Osoba osoba2 = new Osoba("Amelia", "Nowak");
        System.out.println(osoba2.getInfo());
        System.out.println("Hello");
    }
}