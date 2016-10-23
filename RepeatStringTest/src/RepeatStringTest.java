import java.util.*;

public class RepeatStringTest {
	
	public static void main(String[] args) {	
		int repeatTime = 0;
		String targetString = "";
	
		Scanner scan = new Scanner(System.in);
		int questionNumber = scan.nextInt();
		String[] newStringArr = new String[questionNumber];
		
		for (int i = 0; i < questionNumber; i++) {
			repeatTime = scan.nextInt();
			targetString = scan.next();
			NewString newString = new NewString(repeatTime, targetString);
			newStringArr[i] = newString.getNewString();
		}
	
		for (int i = 0; i < questionNumber; i++) {
			System.out.println(newStringArr[i]);
		}
	
		scan.close();
	}
}


class NewString {
	int repeatTime;
	String targetString;
	String newString = "";
	
	NewString (int inputRepeatTime, String inputString) {
		repeatTime = inputRepeatTime;
		targetString = inputString;
		setNewString();
	}
	
	String getNewString() {
		return newString;
	}
	
	void setNewString() {
		String[] stringArr = targetString.split("");
		for (int i = 0; i < targetString.length(); i++) {
			for (int j = 0; j < repeatTime; j++) {
				newString = newString + stringArr[i];
			}
		}
	}
}