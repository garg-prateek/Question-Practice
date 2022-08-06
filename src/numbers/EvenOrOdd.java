package numbers;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number");

		try (Scanner scanner = new Scanner(System.in);) {
			int number = scanner.nextInt();

			if (number <= 0) {
				// System.out.println("Invalid number"+number);
				throw new IllegalArgumentException("Invalid number " + number);
			} else if (number % 2 == 0) {
				System.out.println("Even number");

			} else {
				System.out.println("Odd number");
			}
			// scanner.close();
		}

	}
}
