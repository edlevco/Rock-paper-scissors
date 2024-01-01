// Name: Rock Paper Scissors
//Author: Eddie Levcovich
// Date: Jan 1
import java.util.Scanner;
public class rock_paper_scissors {
    public static void main(String[] args) {

        // define variables
        boolean firstTime = true;
        int roundNumber = 0;
        int wins = 0;
        int loses = 0;
        int ties = 0;
        String computer_output = "";
        Scanner scan = new Scanner(System.in);
        while (true) {
            //Only shows once and explains rules and how to quit
            if (firstTime) {
                System.out.println("Welcome to Rock Paper Scissors!");
                System.out.println("If you ever want to quit type 'q'");
                firstTime = false;
            }
            // make random number from 1-3 (they will be assigned to a move)
            double randNum = Math.floor(Math.random() * 3) + 1;
            System.out.println("What is your move ('rock', 'paper', 'scissors')");
            String user_output = scan.nextLine();
            String user_output_lower = user_output.toLowerCase(); // user move (rock paper or scissors)
            if (user_output_lower.equals("q")) { // checks if they want to quit
                break;

            }
            // assign computer random number to a move
            if (randNum == 1) {
                computer_output = "rock";
            } else if (randNum == 2) {
                 computer_output = "paper";
            } else if (randNum == 3) {
                 computer_output = "scissors";
            }
            // output computer move and your move
            System.out.print("You played "+ user_output_lower+ " and the computer played "+ computer_output + " so ");
            // check who wins
            if (computer_output.equals(user_output_lower)) // checks if both hands are the same
                {
                System.out.println("it's a tie!");
                // if tie add a point to tie and add on to round numbers
                ties++;
                roundNumber++;
            } else if (
                    (computer_output.equals("rock") && user_output_lower.equals("scissors")) ||
                            (computer_output.equals("paper") && user_output_lower.equals("rock")) ||
                            (computer_output.equals("scissors") && user_output_lower.equals("paper"))
                    // checks all situations when computer output beats user input
            ) {
                System.out.println("the computer wins!");
                // if computer wins add a point to loses and add on to round numbers
                loses++;
                roundNumber++;
            } else if (
                    (user_output_lower.equals("rock") && computer_output.equals("scissors")) ||
                            (user_output_lower.equals("paper") && computer_output.equals("rock")) ||
                            (user_output_lower.equals("scissors") && computer_output.equals("paper"))
                    // checks all situation that user input beat computer output
            ) {
                System.out.println("you win!");
                // if user wins a point to wins and add on to round numbers
                wins++;
                roundNumber++;
            } else {
                System.out.println("That is not one of the options");
                //when computer puts a move that is not an option
            }
            System.out.println("Round: "+ roundNumber);
            System.out.println("Wins: "+wins);
            System.out.println("Ties: "+ ties);
            System.out.println("Loses: "+ loses);
            // output rounds, wins, ties, and loses after every round

        }
        System.out.println("Final Record W-T-L");
        System.out.println(wins + "-"+ ties+"-"+loses);
        // when user quits out of loop it outputs final record in W-T-L format
        if (wins > loses) {
            System.out.println("Player wins");
        } else if (wins < loses) {
            System.out.println("Computer wins");
        } else {
            System.out.println("Its a tie");
        }
        // checks who won and outputs winner
        System.out.println("Thanks for playing!");
        // end message


    }
}
