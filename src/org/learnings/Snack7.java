package org.learnings;

import java.util.Scanner;

/*
* Snack 7
* Scrivere un programma che dati dei secondi li converta in ore,
*  minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
* */
public class Snack7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserire il numero di secondi: ");
        int totalSeconds= Integer.parseInt(scanner.nextLine());

        // Secondi in un minuto
        int secPerMinute= 60;

        // Secondi in un'ora
        int secPerHour= secPerMinute * 60;

        // Prendo la parte intera inferiore di secondi totali fratto il numero di secondi in un'ora
        int hours= (int)Math.floor(totalSeconds / secPerHour);

        // Prendo la parte intera del resto che eccede dal totale delle ore fratto il numero di secondi in un minuto
        int minutes= (int)Math.floor((totalSeconds % secPerHour) / secPerMinute);

        // Prendo la parte intera che eccede dal totale dei minuti, la rimanenza equivale ai secondi tolte ore e tolti minuti
        int seconds= (int)Math.floor((totalSeconds % secPerMinute));


        System.out.println("Ore: " + hours);
        System.out.println("Minuti: " + minutes);
        System.out.println("Secondi: " + seconds);

        // Formattazione orario
        System.out.println(
                "Tempo totale: " +
                String.format("%02d", hours) + ":" +
                String.format("%02d", minutes) + ":" +
                String.format("%02d", seconds
                ));
    }
}
