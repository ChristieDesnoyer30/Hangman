package com.company;

import java.util.Scanner;

public class Hangman {


    private static String[] hangMan = {"carla", "arrays", "temperature", "modulus",
            "macadamia", "integer", "learning", "detroit", "woodward"};
    private static String findWord = hangMan[(int) (Math.random() * hangMan.length)];

    public static void main(String[] args) {
        /*Write a game of Hangman. The program should give the user a word's length,
        should allow the user to guess a limited number of times,
        should keep track of letters the user has already guessed and display them upon request,
        and should offer up to (2) 1-letter hints on request.
        The program should have a library of at least 20 potential words.*/

        breakIntoCharArray(findWord);

    }

    //breaks word into a character array and then displays asterisks to the user.
    public static void breakIntoCharArray(String findWord) {

        char[] chars = new char[findWord.length()];


        for (int i = 0; i < findWord.length(); i++) {

            chars[i] = findWord.charAt(i);

        }

        System.out.println(findWord);

        for (char letter : chars) {

            letter = '*';

            System.out.print(letter);
        }

        isLetterInWord(chars);

    }

    private static void isLetterInWord(char[] chars) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Guess your first letter.");

        char letters = scan.next().charAt(0);

        for (int i = 0; i < chars.length; i++) {

            if (letters == chars[i]) {

                System.out.println(letters + " is in the word!");


                break;

            }


        }
    }
}










