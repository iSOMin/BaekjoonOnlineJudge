import java.util.*;

public class WordCountingTest {
	public static void main (String[] argv) {
		int wordNumber = 0;
		WordCounter wordCounter;
		Scanner scan = new Scanner(System.in);
		
		String targetString = scan.nextLine();
		wordCounter = new WordCounter(targetString);
		
		wordNumber = wordCounter.countWord();
		System.out.println(wordNumber);
		
		scan.close();
	}
}

class WordCounter {
	String targetString;
	int wordCount = 0;
	int nonStringCount = 0;
	
	WordCounter(String targetString) {
		this.targetString = targetString;
	}
	
	int countWord() {
		String token[] = targetString.split(" ");
		for (int i = 0; i < token.length; i++) {
			if (token[i].equals("") || token[i] == null) {
				nonStringCount++;
			}
		}
		
		wordCount = token.length - nonStringCount;
		return wordCount;
	}
}