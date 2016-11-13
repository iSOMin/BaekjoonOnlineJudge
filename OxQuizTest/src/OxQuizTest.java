import java.util.*;

public class OxQuizTest {
	public static void main(String[] argv) {
		int questionNumber = 0;
		int[] totalScore;
		String testResult;
		Scanner scan = new Scanner(System.in);
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		
		questionNumber = scan.nextInt();
		totalScore = new int[questionNumber];
		for (int i = 0; i < questionNumber; i++) {
			testResult = scan.next();
			scoreCalculator.setScoreArray(testResult);
			totalScore[i] = scoreCalculator.getTotalScore();
		}
		
		for (int i = 0; i < questionNumber; i++) {
			System.out.println(totalScore[i]);
		}
		
		scan.close();
	}
}

class ScoreCalculator {
	StringTokenizer resultArray;
	String[] resultString;
	int[] scoreArray;
	int totalScore;
	
	ScoreCalculator() {
		
	}
	
	void setScoreArray(String targetArray) {
		resultString = targetArray.split("");
		scoreArray = new int[targetArray.length()];
		totalScore = 0;
	}
	
	int getTotalScore() {
		calculateTotal();
		return totalScore;
	}
	
	void calculateTotal() {
		int scoreAccumulated = 0;
		for(int i = 0; i < resultString.length; i++) {
			if (resultString[i].compareTo("O") == 0) {
				scoreAccumulated++;
				scoreArray[i] = scoreAccumulated;
			} else {
				scoreAccumulated = 0;
				scoreArray[i] = 0;
			}
			totalScore += scoreArray[i];
		}
	}
}
