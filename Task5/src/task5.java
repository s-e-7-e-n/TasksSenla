import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int N;
		
		while (true) {
			try {
				System.out.print("Enter N(0...100): ");
				N = reader.nextInt();
				if (N < 0 || N > 100) {
					throw new IllegalArgumentException("Number less then 0 or more than 100");
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
		
		ArrayList<Integer> palindroms = new ArrayList<Integer>();
		
		for (int i = 0; i <= N; i++) {
			if (i < 10 || i%11 == 0) {
				palindroms.add(i);
			}
		}
		
		System.out.print(palindroms);	
	}
}
