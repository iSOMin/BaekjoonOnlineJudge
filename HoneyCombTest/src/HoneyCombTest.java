import java.util.*;

public class HoneyCombTest {
	public static void main(String[] argv) {
		HoneyComb honeyComb = new HoneyComb();
		Scanner scan = new Scanner(System.in);
		int questionRoom = 1;
		int answer;
		
		
		questionRoom = scan.nextInt();
		answer = honeyComb.getShortestDistanceFrom1To(questionRoom);
	
		System.out.println(answer);
		
		
		scan.close();
	}
}

class HoneyComb {
	int startPoint;
	int endPoint;
	int roomDepth = 0;
	
	HoneyComb () {
		startPoint = 1;
		endPoint = 1000000000;
	}
	
	int getShortestDistanceFrom1To (int targetRoom) {
		calculateDepth (targetRoom);
		return roomDepth;
	}
	
	void calculateDepth (int targetRoom) {
		double calcResult;
		calcResult = (3 + Math.sqrt(9 - 12 * (1 - (double)targetRoom))) / 6;
		roomDepth = (int)Math.ceil(calcResult);
	}
}