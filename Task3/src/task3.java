import java.util.Scanner;
import java.util.Arrays;

public class task3 {
	static class Text {
		static int wordsCount(String text) {
			return text.split(" ").length;
		}
		
		static String sortedText(String text) {
			String newText = "";
			String[] words = text.split(" ");
			Arrays.sort(words);
			
			for (String word : words) {
				newText += word.substring(0, 1).toUpperCase() + word.substring(1) +" ";
			}
			
			return newText;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the text: ");
		String text = reader.nextLine();
		reader.close();
		System.out.println("Number of words = " + Text.wordsCount(text));
		System.out.println(Text.sortedText(text));
	}
}

