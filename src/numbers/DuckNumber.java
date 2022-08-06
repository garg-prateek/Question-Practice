package numbers;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		boolean isDuckNumber = false;
		while (num != 0) {
			digit = num % 10;
			if (digit == 0) {
				isDuckNumber = true;
				break;
			}

			num = num / 10;
//break
		}

		if (isDuckNumber) {
			System.out.println("Great!! It's a DUCK number");
		} else {
			System.out.println("Oh!! Not a DUCK number");
		}
		scanner.close();
	}

}
