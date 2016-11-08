import java.util.*;

public class FractionTest {
	public static void main(String[] argv) {
		FractionFinder fractionFinder = new FractionFinder();
		Scanner scan = new Scanner(System.in);
		
		int question = 1;
		String answer;
		
		question = scan.nextInt();
		answer = fractionFinder.getFractionAt(question);
		
		System.out.println(answer);
		
		
		scan.close();
	}
}

class FractionFinder {
	int depth;
	String fractionAt;
	
	FractionFinder () {
	}
	
	String getFractionAt (int targetLocation) {
		getStartDepth(targetLocation);
		
		int numberInDepth = targetLocation - ((depth * (depth - 1)) / 2);

		if (depth % 2 == 0) {
			fractionAt = numberInDepth + "/" + (depth - numberInDepth + 1);
		} else {
			fractionAt = (depth - numberInDepth + 1) + "/" + numberInDepth;
		}
		
		return fractionAt;
	}
	
	void getStartDepth (int targetLocation) {
		double calcResult;
		calcResult = (-1 + Math.sqrt(1 + 8 * targetLocation)) / 2;
		depth = (int)Math.ceil(calcResult);
	}
}