/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mostromn.rockpaperscissors;
import java.util.Scanner;

/**
 *
 * @author nicholasmostrom
 */
public class RockPaperScissors {
    public static void main(String[] args){
        //get user imput
        Scanner in = new Scanner(System.in);    
        int computerScore = 0;
        int userScore = 0;
        int userTie = 0;
        int rounds = 0;
        String stringRounds = "";
        
                
        System.out.println("How many roudns would you like to play? (Maximum 10)");
        stringRounds = in.nextLine();
        
        rounds = Integer.parseInt(stringRounds);
        
        
        for (int i = 0; i < rounds; i ++) {
        System.out.println("Enter your move. Type in rock, paper, or scissors");
        String myMove = in.nextLine();
            
        
        //Verify valid move
        if(!myMove.equals("rock") && !myMove.equals("paper") && 
           !myMove.equals("scissors")){
            System.out.println("Your move isn't valid, Try again");
        }   else {
        
        
        //Randomly generate opponets move (0,1,2)
            int rand = (int)(Math.random()*3);
            String opponentMove = "";
            if(rand == 0){
            opponentMove = "rock";
            } else if(rand == 1){   
            opponentMove = "paper";
            } else {
            opponentMove = "scissors";
            }
            System.out.println("Opponent move: " + opponentMove);
            
            
        // Calculate if user won, lost, or tied 
            if(myMove.equals(opponentMove)) {
              System.out.println("You tied"); 
              userTie = userTie + 1;
            } else if((myMove.equals("rock") && opponentMove.equals("scissors")) 
              || (myMove.equals("scissors") && opponentMove.equals("paper")) ||
              (myMove.equals("paper") && opponentMove.equals("rock"))) {
              System.out.println("You won!!");
              userScore = userScore + 1;
            } else {
                System.out.println("You lost");
                computerScore = computerScore + 1;
                
            }
            System.out.println("Wins: " + userScore);
            System.out.println("Loses: " + computerScore);
            System.out.println("Ties: " + userTie);
         } 
                    
        }    
    }
}
