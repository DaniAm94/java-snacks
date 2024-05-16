package org.learnings;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int num= Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0) {
            System.out.println(num);
        }else {
            System.out.println(num+1);
        }
    }
}
