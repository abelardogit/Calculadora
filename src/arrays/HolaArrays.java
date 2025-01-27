package arrays;

import javax.swing.*;
import java.util.Scanner;

public class HolaArrays {

    public static void main(String[] args) {
        String userText;
       Scanner scanner = new Scanner(System.in);
        int contVowels = 0;

        userText = scanner.nextLine();

        for(int i=0; i < userText.length(); i++) {
            char currentChar = userText.charAt(i);
            if ('a' == currentChar ||
                'e' == currentChar ||
                'i' == currentChar ||
                'o' == currentChar ||
                'u' == currentChar)
             {
                 contVowels++;
            }
        }

        System.out.println("El número de vocales es " + contVowels);
    }
}
