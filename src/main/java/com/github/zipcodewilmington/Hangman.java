package com.github.zipcodewilmington;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Hangman {


    Scanner scanner = new Scanner(System.in);
    String[] randomWords = {"dog", "cat", "turtle", "snake"};
    Character[] playerGuesses;
    int numTries = 0;
    int guessesLeft = 0;
    public static void main(String[] args){
        new Hangman().run();

    }
    public void run(){
        // Create a Random object
        Random random = new Random();

        // Generate a random index between 0 and the length of the array
        int randomIndex = random.nextInt(randomWords.length);

        // store solution into the Character array Solution initialized above
        String word = randomWords[randomIndex];
        char[] solution = word.toCharArray();

        numTries = 0;
        guessesLeft = solution.length;
        System.out.println("Number of guesses left: " + guessesLeft);


        while (guessesLeft < solution.length){
            if (scanner.next("-"))
                System.out.println("Game over");
            break;
        } else {
            //process char
        }
    }
}






/*
1. starts the game
2. a random word is chosen from a list
3. the number of tries allowed is set to the length of the word
4. setup the two (the solution and the player's guesses) character arrays
5. WHILE the numbers of tries is less than tries allowed AND
6. the player has not guessed the word
7. print the current state of the player's guesses
8. ask the player for a letter (a character)
9. if the letter is a minus "-", quit the game
        else process the letter
10. if the letter makes the work complete,
    the player wins
11. after the while loop
    if the word is not guessed, player loses
12. Now, another twist to the game is to add an "outer loop" which asks the player if they would like to play again.
    This outer loop would surround the logic in the
 */