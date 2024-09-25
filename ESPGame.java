/* 
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: the Program takes a users input and opens a file reads a list of colors and asks the user to
 * choose one of the colors and determines if the users guess matches the color chosen by the computer
 * then tells them their overall score and takes their name, description and date input and displays it in
 * a proper format.
 * Due: 06/18/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Print your Name here: Fernando Benitez-Diaz
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.println("Enter the filename: ");
		
		String fileName = input.nextLine();
		File myFile = new File(fileName);
		Scanner fInput = new Scanner(myFile);
		
		System.out.println("There are sixteen colors from a file:");
		
		Random rand = new Random();
		int num1, num2, num3;
		String guess1, guess2, guess3;
		int number = 1;
		int len, index;
		num1 = rand.nextInt(1,17);
		guess1 = "";
		guess2 = "";
		guess3 = "";
		
		do
		{
			num2 = rand.nextInt(1,17);
		}
		while(num2 == num1);
		do
		{
			num3 = rand.nextInt(1,17);
		}
		while((num3 == num1) || (num3 == num2));
		//Displaying random numbers
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		while (fInput.hasNext())
		{
			String n = fInput.nextLine();
			System.out.println(n);
			if (number > 9)
			{
				index = 3;
			}
			else
			{
				index = 2;
			}
			
			if (number == num1)
			{
				guess1 = n.substring(index);
			}
			else if (number == num2)
			{
				guess2 = n.substring(index);
			}
			else if (number == num3)
			{
				guess3 = n.substring(index);
			}
			number++;
		}
		//making sure values are created.
//		System.out.println("Guess 1: " + guess1);
//		System.out.println("Guess 2: " + guess2);
//		System.out.println("Guess 3: " + guess3);
		int score = 0;
		//Round 1
		System.out.println("Round 1\n");
		System.out.println("I am thinking of a color.");
		System.out.println("Is it one the list of colors above?");
		System.out.println("Enter your guess: ");
		String usersGuess = input.nextLine();
		System.out.println("\nI was thinking of " + guess1);
		if (usersGuess.equalsIgnoreCase(guess1))
		{
			score += 1;
		}
		//Round 2
		System.out.println("Round 2\n");
		System.out.println("I am thinking of a color.");
		System.out.println("Is it one the list of colors above?");
		System.out.println("Enter your guess: ");
		usersGuess = input.nextLine();
		System.out.println("\nI was thinking of " + guess2);
		if (usersGuess.equalsIgnoreCase(guess2))
		{
			score += 1;
		}
		// Round 3
		System.out.println("Round 3\n");
		System.out.println("I am thinking of a color.");
		System.out.println("Is it one the list of colors above?");
		System.out.println("Enter your guess: ");
		usersGuess = input.nextLine();
		System.out.println("\nI was thinking of " + guess3);
		if (usersGuess.equalsIgnoreCase(guess3))
		{
			score += 1;
		}
		
		//End Game
		System.out.println("GAME OVER");
		System.out.println("\nYou guessed " + score + " out of 3 colors correctly.");
		
		//Student input
		String name, description, date;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Describe yourself: ");
		description = input.nextLine();
		
		System.out.print("Enter the Date: ");
		date = input.nextLine();
		
		//Print student input
		System.out.println("User Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Date: " + date);
		
		
	}
}
