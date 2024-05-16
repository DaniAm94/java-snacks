package org.learnings;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String word= scanner.nextLine().trim();
        char[] charArray= word.toLowerCase().toCharArray();
        char[] reverseArray= new char[charArray.length];
        int left= 0;
        int right= charArray.length-1;
        while (left <= right){
            reverseArray[left]= charArray[right];
            reverseArray[right]= charArray[left];
            left++;
            right--;
        }
        String reverseWord= new String(reverseArray);
        System.out.println("Parola invertita: " + reverseWord);
        if (reverseWord.equals(word.toLowerCase())) {
            System.out.println("La parola inserita è una palindoma");
        }else{
            System.out.println("La parola inserita non è una palindroma");
        }

    }
}
