/*
 * NAME:        Chris Hitchcock
 * DATE:        20/09/16
 * FILENAME:    GuessingGame.java
 * DESCRIPTION: This program is a game in which a random number 1-20 is generated, and
 *              the user has to guess the number. Each incorrect guess gives the user
 *              a higher/lower hint.
 *              
 * GITHUB:      "GuessingGame"
 */
package guessinggame;

import java.util.*;

public class GuessingGame {

    //Static variable/object declaration
    static Random r = new Random();
    static int guess, answer;

    //This method is called when a wrong guess is given, and gives a higher/lower hint
    public static void giveHint() {
        //If the guess is low, hint is to try higher, and vice versa
        if (guess < answer) {
            System.out.println("Hint: try a higher number.\n");
        } else if (guess > answer) {
            System.out.println("Hint: try a lower number.\n");
        }

    }

    public static void main(String[] args) {
        //Variable/Object declaration
        boolean correct;
        correct = false;
        Scanner kb = new Scanner(System.in);

        //Generate a random number ONCE before starting loop
        answer = r.nextInt(20) + 1;

        //Loop to continue until user guesses right
        while (correct == false) {
            //Obtain the guess from the user
            System.out.print("Enter a number between 1 and 20: ");
            guess = kb.nextInt();
            
            if (guess>=1&&guess<=20)
            {
                //Check if answer is correct or not
                if (answer == guess) {
                    //Congratulate the player if he guesses right and end process
                    System.out.println("Correct!");
                    correct = true;
                } else {
                    //Call hint if the guess was wrong
                    correct = false;
                    giveHint();
                }
            } else {
                System.out.println("Please enter a valid number (1-20).");
                }
        }
    }

}
