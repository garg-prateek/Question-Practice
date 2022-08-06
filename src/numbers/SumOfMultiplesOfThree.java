package numbers;

import java.util.Scanner;

public class SumOfMultiplesOfThree {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;
		while (num != 0) {
			digit = num % 10;
			// System.out.println(digit);
			if (digit == 3 || digit == 6 || digit == 9) {
				sum += digit;
			}

			num = num / 10;
		}
		System.out.println("Sum of digits which are multiple of three  is: " + sum);
//		System.out.println("Sum of even numbers: " + even);
//		System.out.println("Sum of odd numbers: " + odd);

		scanner.close();
	}

}
