package numbers;

import java.util.Scanner;

public class SearchNumberOfTimeOccurance {
	// static int count;
//	static int digit;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the digit");
		int digit = s.nextInt(), a;
		System.out.println("Enter the digit to be searched");
		int search=s.nextInt();
		
		// double digit = s.nextDouble();
		int count = 0;
		while (digit != 0) {
			a=digit%10;
			if(a==search) {
				count++;
			}
			digit = digit / 10;
			
		}
		System.out.println("No of times the digit occured is " + count);
		s.close();
	}

}
