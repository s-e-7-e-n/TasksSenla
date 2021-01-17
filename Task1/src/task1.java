import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class task1 {
	
	static class Number {
		
		public static boolean isEven(int num) {
			if (num%2 == 0) {
				return true;
			}
			return false;
		}
		
		public static boolean isPrime(int number) {
			if (number == 0) {
				return false;
			}
			
			double num = (int)number;
			int rootOfNum = (int) Math.sqrt(num);
			for (int i = 2; i <= rootOfNum; i++) {
				if (number%i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int number;
		while (true) {
			try {
				System.out.print("Enter an integer: ");
				number = reader.nextInt();
				if (number < 0) {
					throw new IllegalArgumentException("Number less then 0");
				}
				break;
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				reader.next();
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		reader.close();
		if (Number.isPrime(number)) {
			System.out.println("Prime");
			System.out.println("Odd");
		}
		else {
			System.out.println("Composite");
			if (Number.isEven(number)) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
	}

}