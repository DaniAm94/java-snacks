package org.learnings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Scegli una lunghezza: ");
        int arrayLength= Integer.parseInt(scanner.nextLine());
        Random randomGenerator= new Random();
        int[] numbers= new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
        numbers[i]= randomGenerator.nextInt(100) +1;
        }
        System.out.println("Il tuo array di numeri casuali: " + Arrays.toString(numbers));
        int oddSum=0;
        for (int i = 1; i < arrayLength; i++) {
            if (i % 2 != 0){
                oddSum+= numbers[i];
            }
        }
        System.out.println("Somma degli elementi in posizione dispari: " + oddSum);
    }
}
