package numbers;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		System.out.println("Enter the Credit Score: ");
		Scanner scanner = new Scanner(System.in);
		int CreditScore = scanner.nextInt();
		if (CreditScore < 400 || CreditScore > 850) {
			System.out.println("Invalid Score");
		} else if (CreditScore >= 400 && CreditScore < 600) {
			System.out.println("Silver Card");
		} else if (CreditScore >= 600 && CreditScore < 800) {
			System.out.println("Gold card");
		} else {
			System.out.println("Platinum card");
		}
		scanner.close();
	}

}
