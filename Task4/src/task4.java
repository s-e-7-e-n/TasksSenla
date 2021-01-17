import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the text: ");
		Text text = new Text(reader.nextLine());
		String word = reader.next();
		reader.close();
		System.out.print("Number of the word = " + text.countWord(word));
	}

}

class Text {
	private String text;
	
	Text(String text) {
		this.text = text;
	}
	
	public int countWord(String need_word) {
		need_word = need_word.toLowerCase();
		String[] words = this.text.toLowerCase().split(" ");
		int count = 0;
		for (String word : words) {
			if (need_word.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
