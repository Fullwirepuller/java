package example;

import java.util.Scanner;

public class test3 { //猜数小游戏
	public static void main(String[] args) {
		String choose;
		do {
			int randomNumber;
			int myGuess;
			int times;

			randomNumber = (int) (Math.random() * 1000 + 1);
			System.out.println("random " + randomNumber);

			System.out.println("I have a number between 1 and 1000");
			System.out.println("Can you guess my number");
			System.out.println("Please type your first guess");

			Scanner scan = new Scanner(System.in);
			myGuess = scan.nextInt();

			for (times = 1; times < 10; times++) {
				if (randomNumber == myGuess) {
					System.out.println("Excellent! You guessed the number!");
					break;
				} else if (randomNumber < myGuess) {
					System.out.println("Too High.Try Again!");
				} else {
					System.out.println("Too Low.Try Again!");
				}
				System.out.println("left " + (10 - times));
				System.out.println("Please type your again!");
				myGuess = scan.nextInt();
			}
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Would you like to play again?(YES/NO)");
			choose = scan1.nextLine();
		} while (choose.equals("YES"));
		System.out.println("game over!");
	}
}
