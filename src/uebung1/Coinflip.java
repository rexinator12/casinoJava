package uebung1;

import java.util.Random;
import java.util.Scanner;

public class Coinflip {
	//Code by Rafael & Janakan
	//imports
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
		
	//main play function, accepts balance
	public static double play(double balance) {
		//variables 
		double bet = 0;
		String prediciton;
		boolean play = true;
			
		//loops if the player wants to play
		while (play) {
			//makes sure player has balance to play
			if (balance == 0) {
				return balance;
			}
			//prints gameplay
			System.out.println("Your Balance: " + balance);
			System.out.println("How much do you want to bet");
			//sets bet
			bet = betting.bet(bet, balance);
			//subtracts bet from balance
			balance -= bet;
			System.out.println("What do you want to bet on? (Heads or Tails)");
				
			//checker to make sure input is valid
			while (true) {
				String answer = scan.next();
				//checks input if it's heads or tails
				if (answer.toLowerCase().equals("heads")) {
					prediciton = "heads";
					break;
				} else if (answer.toLowerCase().equals("tails")) {
					prediciton = "tails";
					break;
				//invalid if it's not one of those three
				} else {
					System.out.println("Invalid Input");
				}
			}
			//runs wheel function and adds it to balance (if lost, bet = 0)
			balance += flip(bet, prediciton);
			//prints balance
			System.out.println("Your Balance: "+ balance);
				
			//play again checker
			System.out.println("Want to play again? (Yes/No) ");
			while (true) {
				String answer = scan.next();
				if (answer.toLowerCase().equals("yes")) {
					break;
				} else if (answer.toLowerCase().equals("no")) {
					play = false;
					break;
				} else {
					//if input invalid, loops
					System.out.println("Invalid Input");
				}
			}
			
		}
		//returns balance to keep track of main balance variable in casino
		return balance;
	}
		
	//random number generator for the wheel
	public static double flip(double bet, String prediction) {
		//gets number 0-1
		int flip = rand.nextInt(2);
		//if number is 0, than its heads else tails
		if (flip == 0) {
			System.out.println("Heads");
			bet = (prediction == "heads") ? bet * 1.95 : 0;
		} else {
			System.out.println("Tails");
			bet = (prediction == "tails") ? bet * 1.95 : 0;
		}
		//returns bet to use 
		return bet;
	}
}