package numbers;

import java.util.Scanner;

public class DigitCounter {
	// static int count;
//	static int digit;

	public static void main(String[] args) {
		System.out.println("Enter the digit");
		Scanner s = new Scanner(System.in);
		int digit = s.nextInt();
		int count = 0;
		while (digit != 0) {
			digit = digit / 10;
			count++;
		}
		System.out.println("No of digits are " + count);
		s.close();
	}

}
