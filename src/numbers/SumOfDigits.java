package numbers;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0, even = 0, odd = 0;
		while (num != 0) {
			digit = num % 10;
			System.out.println(digit);
			sum += digit;
			if (digit % 2 == 0) {
				even += digit;
			} else {
				odd += digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of digits is: " + sum);
		System.out.println("Sum of even numbers: " + even);
		System.out.println("Sum of odd numbers: " + odd);

		scanner.close();
	}

}
