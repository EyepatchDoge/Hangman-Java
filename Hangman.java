package hangman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kassy
 * March 11th, 2018
 */
public class Hangman {

    //create private strings for the different topics, word/phrase(wp) and word count for the game
    private static final String[] topics = {"food", "youtubers", "actors", "radio songs", "games"};
    private static final String[] wp = {"pizza", "pewdiepie", "johhny_depp", "believer", "flappy_bird"};
    private static final int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create a random number to choose the topic
        Random rand = new Random();
        int n1 = rand.nextInt(6) + 1;
            
        /b
                /create a string that creates the "blanks" that need to be filled in by the user 
        String gword = new String(new char[wp[n1].length()]).replace("\0", "-");

        int count = 0;

        //introduction to the game
        System.out.println("Welcome to Hangman! Guess any letter in the word. Start with an underscore! Beware, you only have 7 guesses!");
     
     //gives user word to guess
        System.out.println(gword); 
            
        //string for the word/phrase
        String name = wp[n1];
        int nameLength = name.length();

        //continues printing the following as the game continues until the user loses    
        while (count < 7 && gword.contains("-")) {
            
            // Remind the reader what is the category
            System.out.println("Topic: " + topics[n1]);
            
            // Remind print out the missing words
            System.out.println(gword); 
            String guess = sc.next();

            //replaces spaces with the letters guessed
            String newletter = "";

            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == guess.charAt(0)) {
                    newletter += guess.charAt(0);
                } else if (gword.charAt(i) != '-') {
                    newletter += name.charAt(i);
                } else {
                    newletter += "-";
                }
            }

            if (gword.equals(newletter)) {
                count++;
                
                if  (count == 1) {
            System.out.println("Nice try, but not quite. You have 6 guesses left!");
            System.out.println("  _______");
            System.out.println("   |   ");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("   |________");
        }
                
        if (count == 2) {
            System.out.println("Don't give up, you got this. You have 5 guesses left!");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("   |________");
        }
        
        if (count == 3) {
            System.out.println("If at first you don't suceed; try, try again. You have 4 guesses left!");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |   |");
            System.out.println("   | ");
            System.out.println("   |________");
        }
        
        if (count == 4) {
            System.out.println("Chin up. You made it this far, you are so close. You have 3 guesses left!");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |   |\\");
            System.out.println("   | ");
            System.out.println("   |________");
        }
        
        if (count == 5) {
            System.out.println("I have faith in you. Just believe in yourself. You have 2 guesses left!;");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |  /|\\");
            System.out.println("   | ");
            System.out.println("   |________");
        }

        if (count == 6) {

            System.out.println("Okay. You got one more try. Just take a deep breath and think it thorough. The answer will come to you!");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |  /|\\");
            System.out.println("   |    \\");
            System.out.println("   |________");
        }
        //If the person guess wrong on the seventh guess, it's a game over, thus the gameover messages pops up
        if (count == 7) {

            System.out.println("Wrong guess!!");
            System.out.println("  _______");
            System.out.println("   |   |");
            System.out.println("   |   0");
            System.out.println("   |  /|\\");
            System.out.println("   |  / \\");
            System.out.println("   |________");
            System.out.println("GAME OVER! Darn you were so close. The word/phrase was actually: " +name);
            System.out.println("The random topic was " + topics[n1] + ", the random word/phrase was " + wp[n1]);

        }
                
            } else {
                gword = newletter;
            }
            //if the person guesses it right, the game is over and they win, thus the winning message pops up
            if (gword.equals(name)) {
             System.out.println("YOU WIN!! I told you you could do this! I am so proud of you!!");
            
             System.out.println("The random topic was " + topics[n1] + ", the random word/phrase is " + wp[n1]);
            }
        }
    }
}





        