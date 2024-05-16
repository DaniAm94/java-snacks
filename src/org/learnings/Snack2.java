package org.learnings;

/*
* Snack2
* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
* e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
* */

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        String[] names = {
                "Marco",
                "Luca",
                "Giulia",
                "Francesca",
                "Matteo",
                "Sara",
                "Giorgio",
                "Elena",
                "Roberto",
                "Chiara"
        };

        String[] lastNames = {
                "Rossi",
                "Bianchi",
                "Esposito",
                "Russo",
                "Ferrari",
                "Gallo",
                "Costa",
                "Fontana",
                "Greco",
                "Mancini"
        };
        Random randomGenerator= new Random();
        String[] fullNames= new String[10];
        for (int i = 0; i < fullNames.length; i++) {
                fullNames[i]= names[randomGenerator.nextInt(names.length)] + " " + lastNames[randomGenerator.nextInt(names.length)];
        }
        System.out.println(Arrays.asList(fullNames));
    }
}
