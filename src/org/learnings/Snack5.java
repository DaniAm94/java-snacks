package org.learnings;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String word;
        while (true){
            // Continuo a chiedere una stringa all'utente finchè non inserisce 0
            System.out.print("Inserisci una stringa casuale (0 per terminare): ");
            word= scanner.nextLine().trim();
            if (word.equals("0")) {
                break;
            }
            // Se non inserisce 0 inizializzo 3 contatori per lettere, numeri e simboli a 0
            int letterCounter= 0;
            int numCounter= 0;
            int symbolCounter= 0;
            // Itero la stringa e controllo ogni carattere incrementanto il corrispettivo contatore
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    numCounter++;
                } else if (Character.isLetter(word.charAt(i))) {
                    letterCounter++;
                } else {
                    symbolCounter++;
                }
            }
            // Stampo il risultato di ogni contatore
            System.out.println("Numero di lettere: " + letterCounter);
            System.out.println("Numero di cifre: " + numCounter);
            System.out.println("Numero di simboli: " + symbolCounter);
        }

    }
}
