package org.learnings;

/*
* Snack 6
Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
Possibile usare solo :
cicli
chartAt
if / switch
Es. “25" come stringa deve essere convertito in intero 25.
* */

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        String numericString= scanner.nextLine();
        int number=0;
        if(numericString.charAt(0) == '-'){
            for (int i = 1; i < numericString.length(); i++) {
                // Controllo che ogni valore non sia una lettera
                if(!Character.isDigit(numericString.charAt(i))){
                    System.out.println("La stringa può contenere solo numeri");
                    break;
                }
                number= number * 10 + Character.getNumericValue(numericString.charAt(i));
            }
            number= -number;
        }else{
            for (int i = 0; i < numericString.length(); i++) {
                // Controllo che ogni valore non sia una lettera
                if(!Character.isDigit(numericString.charAt(i))){
                    System.out.println("La stringa può contenere solo numeri");
                    break;
                }
                number= number * 10 + Character.getNumericValue(numericString.charAt(i));
            }
        }
        System.out.println("Numero: " + number);
    }
}
