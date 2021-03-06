/* Odds and Evens game.
   The player chooses Odds or Evens. The computer is the other side.
   Then the player "draws" fingers. So does the computer.
   Then the program evaluates who won.
 */

import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi "+ name + ", which do you choose? (O)dds or (E)vens?: ");
        String playerChoice = input.nextLine();
        String computerChoice = "";
        if (playerChoice.equalsIgnoreCase("O")) {
            computerChoice = "E";
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            computerChoice = "O";
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("------------------------------------------------------");
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();

        //randomize number of finger the computer put out
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("------------------------------------------------------");

        //print message weather the sum is odd or even
        int sum = fingers + computer;
        boolean isOdd = sum % 2 == 1;
        System.out.println(fingers + " + " + computer + " = " + sum);
        if (isOdd) {
            System.out.println(sum + " is ...odd!");
        } else {
            System.out.println(sum + " is ...even!");
        }
        System.out.println("------------------------------------------------------");

        if ((isOdd && playerChoice.equalsIgnoreCase("O")) || (!isOdd && playerChoice.equalsIgnoreCase("E"))) {
            System.out.println("That means " + name + " wins!");
        } else {
            System.out.println("That means the computer wins!");
        }
    }
}
