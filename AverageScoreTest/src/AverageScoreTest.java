import java.util.*;

public class AverageScoreTest {
	public static void main(String[] argv) {
		int totalScore = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			int tempScore = scan.nextInt();
			if(tempScore < 40) {
				totalScore += 40;
			} else {
				totalScore += tempScore;
			}
		}
		System.out.println(totalScore/5);
	}
}