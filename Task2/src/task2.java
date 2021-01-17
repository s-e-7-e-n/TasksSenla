import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;

public class task2 {
	
	static class Number{
		
		public static int gcd(int number1, int number2) {
			int num1 = Math.max(number1, number2);
			int num2 = Math.min(number1, number2);
			int result = 1;
			
			while(result > 0) {
				result = num1%num2;
				num1 = num2;
				num2 = result;
			}
			
			return num1;
		}
		
		public static int lcm(int number1, int number2) {
			return (number1 * number2)/gcd(number1, number2);
		}
		
		public static void check(int num) {
			if (num == 0) {
				throw new IllegalArgumentException("Number shouldn't be zero");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int number1, number2;
		while (true) {
			try {
				System.out.print("Enter first number: ");
				number1 = reader.nextInt();
				Number.check(number1);
				System.out.print("Enter second number: ");
				number2 = reader.nextInt();
				Number.check(number2);
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
		System.out.println("gcd = " + Number.gcd(number1, number2));
		System.out.println("lcm = " + Number.lcm(number1, number2));
	}

}
